package de.telran;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Exercises {

    public Set<Integer> retainUnique(List<Integer> numbers) {
        //return new HashSet<>(numbers);
        Set<Integer> res = new HashSet<>();
        for (int number : numbers) {
            res.add(number);
        }
        return res;
    }

    public List<List<String>> splitWordsByLetter(List<String> words) {
        List<String> copy = new ArrayList<>(words);

        Collections.sort(copy);
        Map<String, List<String>> wordsByFirstLetter = new TreeMap<>();
        for (String word : copy) {
            String firstLetter = word.substring(0, 1);

            List<String> wordsOfLetter = wordsByFirstLetter.get(firstLetter);

            if (wordsOfLetter == null) {
                wordsOfLetter = new ArrayList<>();
                wordsByFirstLetter.put(firstLetter, wordsOfLetter);
            }

            wordsOfLetter.add(word);
        }
        return new ArrayList<>(wordsByFirstLetter.values());
    }
}
