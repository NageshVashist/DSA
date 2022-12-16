package javalanguage.interfaces;

public class DefaultInterfaceImplementation implements MyDefaultInterface_1,MyDefaultInterface_2{
    @Override
    public int sum(int a, int b) {
        return MyDefaultInterface_1.super.sum(a, b);
    }

    @Override
    public String sum(String a, String b) {
        return MyDefaultInterface_2.super.sum(a, b);
    }


}
