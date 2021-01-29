package de.telran;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoService {

    Map<String, List<Auto>> groupByMake(List<Auto> autos) {
        Map<String, List<Auto>> res = new HashMap<>();

        for (Auto auto : autos) {
            List<Auto> autoList = res.get(auto.getMake());
            if (autoList == null) {
                autoList = new ArrayList<>();
                res.put(auto.getMake(), autoList);
            }
            autoList.add(auto);
        }
        return res;
    }
}
