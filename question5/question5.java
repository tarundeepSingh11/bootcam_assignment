package question5;

public class question5 {
    private static question5 instance;

    // private constructor to prevent instantiation of class from outside
    private question5() {}

    // static method to get the instance of Singleton class
    public static question5 getInstance() {
        if (instance == null) {
            instance = new question5();
        }
        return instance;
    }

    public static void main(String[] args) {
        question5 q1=question5.getInstance();
        question5 q2=question5.getInstance();
        System.out.println(q1);
        System.out.println(q2);
    }
}

