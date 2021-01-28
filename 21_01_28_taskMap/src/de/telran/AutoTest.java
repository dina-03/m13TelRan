package de.telran;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    List<Auto> list = new ArrayList<>();

    Auto mazda = new Auto("mazda", "black");
    Auto audi = new Auto("audi", "yellow");
    Auto volkswagen = new Auto("volkswagen", "grey");
    Auto opel = new Auto("opel", "white");
    Auto bmv = new Auto("BMV", "blue");

    Auto[] autoGroup = {mazda, audi, volkswagen, opel, bmv};

    @Test
    public void testGroupAutosByMake_key() {
        list.add(mazda);
        list.add(audi);
        list.add(volkswagen);
        list.add(opel);
        list.add(bmv);

        HashMap<String, List<Auto>> map = new HashMap<>();
        Auto group = new Auto(list);

        for (Auto auto : autoGroup) {
            assertFalse(map.get(auto) != null);
        }
    }

    @Test
    public void testGroupAutosByMake_size() {
        list.add(mazda);
        list.add(audi);
        list.add(volkswagen);
        list.add(opel);
        list.add(bmv);
        assertEquals(5, list.size());
    }
}