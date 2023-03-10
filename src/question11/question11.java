package question11;
record tarun(String name,int id ,int age){
    static int count=0;
    void increment(){
        count++;
    }
     tarun{
        increment();
    }
}
public class question11 {

    public static void main(String[] args) {
        tarun obj = new tarun("Tarundeep" , 22,55) ;
        tarun obj1 = new tarun("mohit" , 22,66) ;
        tarun obj2 = new tarun("karan" , 22,88) ;

        System.out.println(tarun.count);

    }

}
