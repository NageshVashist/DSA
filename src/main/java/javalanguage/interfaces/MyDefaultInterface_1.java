package javalanguage.interfaces;

public interface MyDefaultInterface_1 {
    default int sum(int a,int b){
        return a+b;
    }
    default String sum( String a,String b){
        return a+b;
    }
}
