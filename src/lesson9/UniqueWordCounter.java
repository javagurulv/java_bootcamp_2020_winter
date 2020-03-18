package lesson9;

import java.util.*;

public class UniqueWordCounter {

    private Map<String, Integer> wordsMap = new HashMap<String, Integer>();

    public boolean addWord(String word) {
        boolean isAdded = false;
        if (wordsMap.containsKey(word) && !word.isEmpty()) {
            wordsMap.put(word, wordsMap.get(word) + 1);
            isAdded = true;
        } else if (!word.isEmpty()) {
            wordsMap.put(word, 1);
            isAdded = true;
        }
        return isAdded;
    }

    public void printWordsFrequency() {
        for (String word : wordsMap.keySet()) {
            System.out.println(word + " = " + wordsMap.get(word));
        }
    }

    public String getMostFrequentWord() {
        List<String> mostFrequentWords = new ArrayList<>();
        Integer maxValue = Collections.max(wordsMap.values());
        for (String word : wordsMap.keySet()) {
            if (wordsMap.get(word).equals(maxValue)) {
                mostFrequentWords.add(word);
            }
        }
        return mostFrequentWords.toString().substring(1, mostFrequentWords.toString().length() - 1);
    }

    public String getMostFrequentWordV2() {
        int maxFrequency = getMaxFrequency();
        List<String> wordsWithMaxFrequency = getWordsWithFrequency(maxFrequency);
        return getFirstElementOrNull(wordsWithMaxFrequency);
    }

    private int getMaxFrequency() {
        return Collections.max(wordsMap.values());
    }

    private List<String> getWordsWithFrequency(int frequency) {
        List<String> wordsWithFrequency = new ArrayList<>();
        for (String word : wordsMap.keySet()) {
            if (wordsMap.get(word).equals(frequency)) {
                wordsWithFrequency.add(word);
            }
        }
        return wordsWithFrequency;
    }

    private String getFirstElementOrNull(List<String> wordsWithMaxFrequency) {
        return wordsWithMaxFrequency.isEmpty() ? null : wordsWithMaxFrequency.get(0);
    }

}
