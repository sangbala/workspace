package Array;

import java.util.Arrays;
import java.util.Locale;

public class ArrayOfInt_level2 {

    public static void main(String[] args) {

//        int[] ints={3,9,6,2,1,10,5};
//
//
//        for (int i=0;i<ints.length;i++){
//            for(int j=i+1;j<ints.length;j++){
//                if(ints[i]>=ints[j]){
//                     int temp=ints[i];
//                     ints[i]=ints[j];
//                     ints[j]=temp;
//
//                }
//            }
//            System.out.println(Arrays.toString(ints));
//        }
        String[] str={"2","49","7","5"};
        int[] ints=new int[str.length];
        for (int i=0;i<str.length;i++){
            ints[i]=Integer.parseInt(str[i]);

        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(ints));
        System.out.println(ints.getClass().getName());
        String[] strA={"hello","boston"};
        String[] strB={"hello","boston"};
        boolean b=strA==strB;
        System.out.println(b);
        System.out.println(Arrays.equals(strA,strB));
        String initialString="I love Boston. Yes, you do love boston.";
        String[] strings=initialString.split("[,?.@&$]+");
        String[] newS=new String[strings.length];
      for (int i=0;i<strings.length;i++){
          newS[i]=strings[i].toLowerCase();
      }
        System.out.println(Arrays.toString(newS));



        String lifeIsGood="Life is good";
        String[] strArr=lifeIsGood.split(" ");

        System.out.println(Arrays.toString(strArr));
        char[] charArray=lifeIsGood.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }





}
