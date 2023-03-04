package question4;
import question4.*;
public class computerStation {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new pc(ram, hdd, cpu);
        else if("pc2".equalsIgnoreCase(type)) return new pc2(ram, hdd, cpu);

        return null;
    }
}
