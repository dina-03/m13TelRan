package de.telran.occurrenceByNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The solution solves the problem of finding a number in a integer list which occurs more than
 * the
 */
public class Solution {

    public int solve(List<Integer> numbers) {
        Map<Integer, Integer> occurrenceByNumber = new HashMap<>();
        for (Integer number : numbers) {
            occurrenceByNumber.merge(number, 1, Integer::sum);
        }
        int maxValue = 0;
        int res = 0;
        for (Map.Entry<Integer, Integer> pair : occurrenceByNumber.entrySet()) {
            if (pair.getValue() > maxValue) {
                maxValue = pair.getValue();
                res = pair.getKey();
            }
        }
        return res;
    }
}
