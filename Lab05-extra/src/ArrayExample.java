import java.util.Arrays;
import java.util.Locale;

public class ArrayExample {

    String[] friendName={"Tom","John","Alex"};

    public void convertAndDisplayNamesToUpperCase(){
        for(int i=0;i<friendName.length;i++){
            friendName[i]=friendName[i].toUpperCase();

        }
        System.out.println(Arrays.toString(friendName));
    }

    public static int[] findOddNumbersFromArray(int[] numbers){


        int numberOfOddNumber=0;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]%2==1){
              numberOfOddNumber++;
            }
        }
        int[] ans=new int[numberOfOddNumber];
        int j=0;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]%2==1){
                ans[j]=numbers[i];
                j++;
            }
        }

        return ans;
    }

    public static int findLargestNumberFromArray(int[] numbers){

        int largestIndex=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>numbers[largestIndex]){
                largestIndex=i;
            }
        }
        return numbers[largestIndex];
    }

    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, String... myFriends){

        System.out.println(myName.toUpperCase());
        for (String f:myFriends){

            System.out.println(f.toUpperCase());
        }
    }

}
