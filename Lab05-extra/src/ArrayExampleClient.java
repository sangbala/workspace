import java.util.Arrays;

public class ArrayExampleClient {
    public static void main(String[] args) {
        ArrayExample ae=new ArrayExample();
        ae.convertAndDisplayNamesToUpperCase();
        int[]input={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(ArrayExample.findOddNumbersFromArray(input)));
        System.out.println(ArrayExample.findLargestNumberFromArray(input));
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs
                ("Jack","Tom","Phil","Kyle");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs
                ("Jack","Tom","Phil","Kyle");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs
                ("Jack","Tom","Phil","Kyle","Mike");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs
                ("Jack","Tom","Phil","Kyle","Mike","Tyler","Frank","Dave");
     }
}
