package question2;
class Table1{
     void printTable(int n) {
         synchronized (this) {
             for (int i = 0; i < 5; i++) {
                 System.out.println(i * n);
                 try {
                     Thread.sleep(400);
                 } catch (Exception e) {
                     System.out.println(e);
                 }
             }
         }
     }
}
class Mythread1 extends Thread{
    Table1 t;
    Mythread1(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Mythread2 extends Thread{
    Table1 t;
    Mythread2(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}

public class SychronizeBlock {
    public static void main(String[] args) {
        Table1 o=new Table1();
        Mythread1 m1=new Mythread1(o);
        Mythread2 m2=new Mythread2(o);
        m1.start();
        m2.start();
    }
}
