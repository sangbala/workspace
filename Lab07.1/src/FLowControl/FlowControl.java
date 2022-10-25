package FLowControl;

public class FlowControl {

    public static boolean isItEvenNumber(int number){

        return number%2==0? true:false;
    }
    public static int hexCharToDecimal(char hexChar){

        switch(hexChar){
            case('A'):return 10;
            case('B'):return 11;
            case('C'):return 12;
            case('D'):return 13;
            case('E'):return 14;
            case('F'):return 15;
            default:return hexChar-'0';
        }
    }
}

class main{

    public static void main(String[] args) {

        System.out.println(FlowControl.isItEvenNumber(5));
        System.out.println(FlowControl.isItEvenNumber(11));
        System.out.println(FlowControl.isItEvenNumber(2));
        System.out.println(FlowControl.hexCharToDecimal('A'));
        System.out.println(FlowControl.hexCharToDecimal('5'));
        System.out.println(FlowControl.hexCharToDecimal('F'));
        System.out.println(FlowControl.hexCharToDecimal('9'));

    }
}