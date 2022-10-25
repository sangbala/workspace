package Television;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClientArgs {


    public static void main(String[] args) {

        //System.out.println(args[0]+args[1]+args[2]);
        if(args.length<3){
            System.out.println("Usage:java TelevisionClientArgs brand volume displayType");
            return;
        }




        String brand=args[0];
        int volume= Integer.parseInt(args[1]);
        DisplayType displayType= DisplayType.valueOf(args[2]);

        Television tv1=new Television(brand, volume, displayType);
        System.out.println(tv1.toString());
    }
}
