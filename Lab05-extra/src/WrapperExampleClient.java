import java.time.*;
import java.util.Arrays;

public class WrapperExampleClient {
    public static void main(String[] args) {

        System.out.println(WrapperExample.convertStringToIntPrimitive("888"));
        System.out.println(WrapperExample.convertStringToIntegerObject("987"));

        LocalDate today=LocalDate.now();
        LocalDate newYearsDay=LocalDate.of(2022,Month.APRIL,1);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.printf("zonedDateTime %s %d", "Alan", 888);
        int[]array1={2,3,4};
        int[]array2={2,3,4};
        int[]array3=array1;
        System.out.println(Arrays.equals(array1,array2));
    }
}
