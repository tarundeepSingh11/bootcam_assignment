package Question4;

public class factor {
    public OSpec getInstance(String str){
        if(str.equals("windows")){
            return new Windows();
        }
        else if(str.equals("ios")){
            return new IOS();
        }
        else
            return new Android();
    }
}
