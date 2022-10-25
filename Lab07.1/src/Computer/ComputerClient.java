package Computer;

public class ComputerClient {


    public static void main(String[] args) {
        ComputerUsingIntPrimitives pc=new ComputerUsingIntPrimitives();
        System.out.println(pc.add(100,50));
        System.out.println(pc.subtract(100,50));
        System.out.println(pc.multiple(100,50));
        System.out.println(pc.divide(100,50));

        ComputerUsingLongPrimitives pcLong=new ComputerUsingLongPrimitives();

        System.out.println(pcLong.add(100L,50));
        System.out.println(pcLong.subtract(100,50));
        System.out.println(pcLong.multiple(100,50));
        System.out.println(pcLong.divide(100,30));

        ComputerUsingOverloadedMethods pcOverloaded=new ComputerUsingOverloadedMethods();
        System.out.println(pcOverloaded.add(100L,50));
        System.out.println(pcOverloaded.subtract(100L,50));
        System.out.println(pcOverloaded.multiple(100,50L));
        System.out.println(pcOverloaded.divide(100,30L));
    }





}
