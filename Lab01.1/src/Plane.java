public class Plane {

    int weight;
    String name;
    int reg_id;

    void fly(){
        System.out.println("flying with weight:"+weight);

    }
    void takeOff(){
        System.out.println("taking off");
    }
    void land(){
        System.out.println("landing");
    }

    public static void main(String[] args) {
        Plane aPlane= new Plane();
        aPlane.weight=100;
        aPlane.takeOff();
        aPlane.fly();
        aPlane.land();
    }
}
