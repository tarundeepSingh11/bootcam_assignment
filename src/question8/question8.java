package question8;
class file1 implements AutoCloseable{
    public file1(){
        System.out.println("file is created");
    }
    public void display(){
        System.out.println("Display the content");
    }
    @Override
    public void close() throws Exception {
        System.out.println("file1 is closed");
    }
}

    class file2 implements AutoCloseable{
public file2(){
        System.out.println("file is created");
        }
public void display(){
        System.out.println("Display the content");
        }
@Override
public void close()throws Exception{
        System.out.println("file1 is closed");
        }
}
public class question8 {
    public static void main(String[] args) throws Exception {

        file1 f1=new file1();
        file2 f2=new file2();
        try(f1;f2){
            f1.display();
            f2.display();
        }

    }
}
