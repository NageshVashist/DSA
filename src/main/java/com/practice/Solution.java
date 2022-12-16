package com.practice;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

import com.google.gson.Gson;
import java.net.URL;
import java.net.HttpURLConnection;;


class Result {

    /*
     * Complete the 'calculateNAV' function below.
     *
     * The function is expected to return a DOUBLE.
     * The function accepts STRING date as parameter.
     */
    HashMap<String,HashMap<String,Holding>> map = new HashMap<>() ;

    public static double calculateNAV(String date) {
        Double nav=0.0;
        Result r = new Result();
        String holdingUrl ="https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding";
        String pricingUrl ="https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing";


        r.mapToHolding(r.callUrl(holdingUrl));
        r.mapToPrice(r.callUrl(pricingUrl));

        date= date.replaceAll("[\\s\\-()]}", "");
        if(r.map.containsKey(date)){
            HashMap<String,Holding> m = r.map.get(date);
            for (Map.Entry<String,Holding> e : m.entrySet()) {
                nav+=e.getValue().getQuantity()*e.getValue().getPrice();
            }
        }
        return nav;
    }



    public void mapToPrice(String priceRes){
        try{
            Gson gson = new Gson();
            Price[] pArr = gson.fromJson(priceRes,Price[].class);
            for(Price p : pArr){
                if(map.containsKey(p.getDate())&& map.get(p.getDate()).containsKey(p.getSecurity())){
                    map.get(p.getDate()).get(p.getSecurity()).setPrice(p.getPrice());
                }
            }
        }
        catch(Exception e){

        }
    }

    public void mapToHolding(String holdingRes){
        try{
            Gson gson = new Gson();
            Holding[] hArr = gson.fromJson(holdingRes,Holding[].class);
            for(Holding h: hArr){
                if(map.containsKey(h.getDate())){
                    map.get(h.getDate()).put(h.getSecurity(), h);
                }
                else{
                    HashMap<String,Holding> m= new HashMap<>();
                    m.put(h.getSecurity(), h);
                    map.put(h.getDate(), m);
                }
            }
        }catch(Exception e){

        }
    }

    public String callUrl(String urlString){
        try{
            URL url = new URL(urlString);
            HttpURLConnection con =  (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            if(con.getResponseCode()!=200){
                throw new Exception("invalid url");
            }

            String resString="";

            Scanner scn = new Scanner(url.openStream());

            while(scn.hasNext()){
                resString+=scn.nextLine();
            }
            return resString;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "";
    }

}

class Holding{
    private String date;
    private String security;
    private Integer quantity;
    private Double price;
    private String portfolio;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getSecurity(){
        return security;
    }

    public void setSecurity(String security){
        this.security=security;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public String getPortfolio(){
        return portfolio;
    }

    public void setPrice(String portfolio){
        this.portfolio=portfolio;
    }

}

class Price{
    private String date;
    private String security;
    private Double price;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getSecurity(){
        return security;
    }

    public void setSecurity(String security){
        this.security=security;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double Price){
        this.price=price;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        double result = Result.calculateNAV("20191228");
        System.out.println(result);

    }
}
