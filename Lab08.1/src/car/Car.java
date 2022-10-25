package car;

public class Car extends Vehicle{

    private String make;


    public Car(String vin) {
        super(vin);
    }

    public static void get(Vehicle vehicle){

    }


    public static void main(String[] args) {

        Car car=new Car("AA");
        get(car);
    }
}

