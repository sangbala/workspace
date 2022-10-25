package CatPackage;

public class CatClient {


    public static void main(String[] args) {

        Cat garfield=new Cat();
        garfield.weight=50;
        garfield.name="Garfield";
        garfield.gender=1;
        garfield.color="orange";
        garfield.age=44;

        garfield.getName();
        garfield.getStat();
        garfield.getGender();

        Cat marty=new Cat();
        marty.weight=8;
        marty.name="Marty";
        marty.gender=1;
        marty.color="black";
        marty.age=6;

        marty.getName();
        marty.getStat();
        marty.getGender();

        Cat def4=new Cat();
        def4.getName();
        def4.getGender();
        def4.getStat();
    }



}
