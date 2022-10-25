package MyMath;

public class MyMath {

    private static final int MINIMUM_AGE = 5;
    private static final int MAXIMUM_AGE = 100;

    public static int min(int x, int y){
        return x<y? x:y;
    }
    public static int max(int x, int y){
        return x<y? y:x;
    }

    public static boolean isAgeInRange(int age){
        return age >= MINIMUM_AGE && age <= MAXIMUM_AGE;
    }
}
