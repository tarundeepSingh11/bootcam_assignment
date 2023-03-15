package question2;
class Table{
    synchronized void printTable(int n){
        for(int i=0;i<5;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Mythread11 extends Thread{
    Table t;
    Mythread11(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Mythread22 extends Thread{
    Table t;
    Mythread22(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}


public class SynchronizeMethod {
    public static void main(String[] args) {
        Table o=new Table();
        Mythread11 m1=new Mythread11(o);
        Mythread22 m2=new Mythread22(o);
        m1.start();
        m2.start();

    }
}
