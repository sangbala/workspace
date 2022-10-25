package WhiteBoardModel;

public class PlaneClient {
    public static void main(String[] args) {

        Plane p1=new Plane();
        p1.fly();
        Plane p2=new Plane("N1111","Boeing");
        System.out.println(p2);
        p2.fly();
        Plane p3=new Plane("N1112");
        p3.fly();
        System.out.println(p3);
        System.out.println("Number of times fly method is invoked: "+Plane.getCount());
    }
}
