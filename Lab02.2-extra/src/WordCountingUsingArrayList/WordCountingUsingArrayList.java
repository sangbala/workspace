package WordCountingUsingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCountingUsingArrayList {

    public static void main(String[] args) {

        String initialSentence

                = "Hello I love Boston. Yes, you do Love Boston.";

        String[] initialWordsInArray = initialSentence.split("[, ?.@]+");

        List<String> initialWords =
                Arrays.asList(initialWordsInArray);

        List<String> uniqueWords = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for (String word : initialWords){

            if (!uniqueWords.contains(word.toLowerCase())) {
                uniqueWords.add(word.toLowerCase());
                count.add(1);
            } else {
                int numberOfOccurrences = count.get(uniqueWords.indexOf(word.toLowerCase()));
                numberOfOccurrences++;
                count.set(uniqueWords.indexOf(word.toLowerCase()), numberOfOccurrences);
            }
        }

        for (String word : uniqueWords) {
            System.out.println(word + ": " + count.get(uniqueWords.indexOf(word)));
        }
    }
}


