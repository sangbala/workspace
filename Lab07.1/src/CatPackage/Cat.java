package CatPackage;

public class Cat {

    String name;
    int age;
    String color="white";
    double weight;
    int gender=1; //1 is male; 0 is female


    public void getName(){
        System.out.println("My name is "+name+".");
    }
    public void getStat(){
        System.out.println("My weight is "+weight+".");
        System.out.println("My age is "+age+".");
    }
    public void getGender(){
        if (gender==1){

            System.out.println("My gender is male.");

        }else if(gender==0){

            System.out.println("My gender is female.");

        }else{
            System.out.println("Error: gender must be 1 or 0");

        }


    }


}
