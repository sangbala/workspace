public class Iteration {
    public static void main(String[] args) {
        displayNumbersUsingForLoop(2,7);
        displayNumbersUsingWhile(2,7);
        displayNumbersUsingDoWhile(2,7);
        displayEvenNumbersOnlyUsingForLoop(2,7);
    }
    private static void displayNumbersUsingForLoop(int start, int end){
        for(int i=start;i<end;i++){
            System.out.print(i+",");
        }
    }
    private static void displayNumbersUsingWhile(int start, int end){
        while(start<end){
            System.out.print(start+",");
            start++;
        }
    }
    private static void displayNumbersUsingDoWhile(int start, int end){
        do{
            System.out.print(start+",");
            start++;
        }while(start<end);
    }
    private static void displayEvenNumbersOnlyUsingForLoop(int start, int end){
        while(start<end){
            if(start%2==0){
                System.out.print(start+",");
            }
            start++;
        }
    }
}
