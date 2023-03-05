package Question4;

public class FactoryMain {
    public static void main(String[] args) {
       OSpec obj= new Windows();

       obj.spec();
       //using factory design
        factor f=new factor();
        OSpec obj2=f.getInstance("ios");
        obj2.spec();
    }
}
