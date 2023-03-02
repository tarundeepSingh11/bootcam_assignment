package question1;

public class main {
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.showBank();
        sbi.SBISetter("State Bank of India", "N-17 ABC", "Akash", 22, 5, 9.2, 14);
        sbi.SBIGetter();
        System.out.println(sbi.toString());

        BOI boi = new BOI();
        boi.showBank();
        boi.BOISetter("Bank of India", "A-55 MNO", "Dilip", 14, 6.5, 10.8, 15);
        boi.BOIGetter();
        System.out.println(boi.toString());

        ICICI icici = new ICICI();
        icici.showBank();
        icici.ICICISetter("ICICI", "C-19 XYZ", "Girver", 18, 7, 8.9, 12.5);
        icici.ICICIGetter();
        System.out.println(icici.toString());
    }
}
