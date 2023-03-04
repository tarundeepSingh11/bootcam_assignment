package question4;
import question4.*;
public class testComputer {
    public static void main(String[] args) {
        Computer pc = computerStation.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer pcc2 = computerStation.getComputer("pc2","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+pcc2);
    }


}
