package question1;

enum Size {

    // enum constants calling the enum constructors
    SMALL("The price is less."),
    MEDIUM("The price is medium."),
    LARGE("The price is largee.");


    private final String price;

     //private enum constructor();
    private Size(String price) {this.price = price;}

    public String getPrice() {
        return price;
    }
}

public class Qestion1 {
    public static void main(String[] args) {

        Size s = Size.SMALL;
        System.out.println(s.getPrice());
    }
}
