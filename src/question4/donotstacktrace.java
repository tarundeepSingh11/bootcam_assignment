package question4;

public class donotstacktrace extends RuntimeException{
    @Override
    public synchronized Throwable fillInStackTrace()
    {
        return this;
    }

    public donotstacktrace(String message)
    {
        super(message);
    }

}
