package MyPizzaHouse;

public class MyPizzaHouse {


    private void prepare(){
        System.out.println("prepare");
    }
    private void addToppings(){
        System.out.println("addToppings");
    }
    private void bake(){
        System.out.println("bake");
    }
    public void makePizza(){
        prepare();
        addToppings();
        bake();
    }
}


