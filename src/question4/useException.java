package question4;

public class useException {
    public static void main(String[] args) {
        try
        {
            throw new donotstacktrace("This is a custom exception without a stack trace");
        }
        catch (donotstacktrace e)
        {
            System.out.println(e.getMessage());
        }
    }
}
