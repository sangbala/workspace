package WordCountingUsingHashMap;

import java.util.*;

public class WordCountingUsingHashMap {

    public static void main(String[] args) {


    String initialSentence = "Hello I love Boston. Yes, you do Love Boston.";

    String[] initialWordsInArray = initialSentence.split("[, ?.@]+");

    List<String> initialWords = new ArrayList<String>(Arrays.asList(initialWordsInArray));

    HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

    for(String word:initialWords){
        Integer count=uniqueWordsMap.get(word.toLowerCase());
        uniqueWordsMap.put(word.toLowerCase(),(count==null)? 1:count+1);
    }

    for(Map.Entry<String,Integer> map: uniqueWordsMap.entrySet()){

        System.out.println(map.getKey()+" "+map.getValue());
    }

    }

}
