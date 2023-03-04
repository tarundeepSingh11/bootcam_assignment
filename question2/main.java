package question2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


                while(true){

                        System.out.println("enter the firstname");
                        String fname = sc.nextLine();
                        System.out.println("enter the lastname");
                        String lname = sc.nextLine();
                        System.out.println("enter your age");
                        int ag = sc.nextInt();
                        System.out.println("enter the phonnenumber");
                        int no = sc.nextInt();
                        try{
                            BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));
                            bw.write(new user(fname, lname, ag, no).toString());
                            bw.newLine();
                            bw.flush();
                        }catch (IOException e){
                            e.printStackTrace();}

                       System.out.println("Enter QUIT to Exit:");
                       String choice=sc.next();
                       if (choice.equalsIgnoreCase("QUIT")) break;
                    }






    }
}
