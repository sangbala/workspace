package WordCountingUsingArrays;

public class WordCountingUsingArrays {

}


class main {
    public static void main(String[] args) {

        String sentence = "Hello I love Boston. Yes, you do Love Boston.";
        String res = sentence.replace("[", "")
                .replace(",", "")
                .replace("?", "")
                .replace(".", "")
                .replace("@", "")
                .replace("]", "")
                .replace("+", "");
        String[]array = res.split(" ");
//        System.out.println(res);
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        int[]wordCount=new int[array.length];
        String[]uniqueWords=new String[array.length];

        for (int i=0;i<array.length;i++){
            String matchWord=array[i];
            boolean isUnique=true;
            for(int j=0;j<uniqueWords.length;j++){ //check if the word is already in uniqueWordsArray
                if(matchWord.equalsIgnoreCase(uniqueWords[j])){ //? &&i!=j
                    isUnique=false;
                    wordCount[j]++;
                    break;
                }
            }
            if(isUnique){
                uniqueWords[i]=matchWord;
                wordCount[i]++;
            }

        }
//        for (int i=0;i<array.length;i++){
//             System.out.println(uniqueWords[i]+":"+wordCount[i]);
//        }

        int validLength=0;
        for(int i=0;i<wordCount.length;i++){
            if(wordCount[i]!=0){
                validLength++;
            }
        }
//        System.out.println(validLength);
        for(int i=0;i<validLength;i++){
            System.out.println(uniqueWords[i]+":"+wordCount[i]);
        }

    }
}