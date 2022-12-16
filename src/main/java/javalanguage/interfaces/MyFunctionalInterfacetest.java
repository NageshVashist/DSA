package javalanguage.interfaces;

import java.util.function.Consumer;

public class MyFunctionalInterfacetest {
    public static void main(String[] args) {

        MyFunctionalInterface a= (s)-> s.repeat(5);
        System.out.println(a.print("Nagesh "));
        Consumer c = (s)-> ((String)s).repeat(5);
    }
}
