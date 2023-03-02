package question1;

public class main {
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.showBank();
        sbi.SBISetter("State Bank of India", "motinagar", "karan", 22, 5, 8.2, 7);
        sbi.SBIGetter();
        System.out.println(sbi.toString());

        BOI boi = new BOI();
        boi.showBank();
        boi.BOISetter("Bank of India", "kirti nagar", "tarun", 15, 9, 14, 10);
        boi.BOIGetter();
        System.out.println(boi.toString());

        ICICI icici = new ICICI();
        icici.showBank();
        icici.ICICISetter("ICICI", "patel nagar", "Anuj", 14, 4.45, 8, 16);
        icici.ICICIGetter();
        System.out.println(icici.toString());
    }
}
