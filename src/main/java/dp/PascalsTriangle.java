package dp;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows=5;

        List <List<Integer>> row = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> col= new ArrayList<>();
            for(int j =0 ;j<=i;j++){
                if(j==0 || j==i){
                    col.add(1);
                }
                else{
                    List<Integer> prevRow = row.get(i - 1);
                    col.add(prevRow.get(j-1)+prevRow.get(j));
                }
            }
            row.add(col);

        }
        System.out.println(row);
    }
}
