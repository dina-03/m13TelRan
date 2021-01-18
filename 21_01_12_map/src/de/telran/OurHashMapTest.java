package de.telran;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {
    OurHashMap key = new OurHashMap();

   /* @Test
    public void whenHashCodeIsCalledOnPut_thenCorrect(){
        Map<OurHashMap, String> map = new HashMap<>();
        map.put(key, "val");
    }

    @Test
    public void givenExistingKey__whenPutReturnsPrevValue__thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");

        String rtnVal = map.put("key1", "val2");

        assertEquals("val1", rtnVal);
    }

    @Test
    public void givenNewKey__whenPutReturnsNull__thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String rtnVal = map.put("key1", "val1");

        assertNull(rtnVal);
    }

    @Test
    public void givenNullVal__whenPutReturnsNull__thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String rtnVal = map.put("key1", null);

        assertNull(rtnVal);
    }*/

    OurHashMap<String, Auto> map = new OurHashMap<>();


    @Test
    void testPut_resize() {
        OurHashMap<String, Auto> map = new OurHashMap<>(0.5);
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);
        assertEquals(map.get("WIN56256"), audi2);
        assertEquals(map.size(), 9);
    }

    @Test
    void changeTheValueOofAnExistingElement() {

        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN5628", audi);
        map.put("WIN5628", audi2);
        assertEquals(map.get("WIN5628"), audi2);
        assertTrue(map.get("WIN5628") != audi);
        assertEquals(map.size(), 1);
    }

    @Test
    void testRemove_twoObjectInCells_bottom() {
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);
        assertEquals(map.remove("WIN8989"), bmw);
        assertEquals(map.get("WIN74528"), opel);
        assertEquals(map.size(), 8);
        String[] autoWin={"WIN4528","WIN56828","WIN74528","WIN56628","WIN56298","WIN8988","WIN5628","WIN56256"};
        checkAllElements(map,autoWin);
    }

    @Test
    void testRemove_OneElement(){
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(map.remove("WIN8988"), bmw);
       // assertThrows(IndexOutOfBoundsException.class, () -> map.get("WIN8988"));
        assertEquals(map.size(), 8);
        String[] autoWin={"WIN4528","WIN56828","WIN74528","WIN56628","WIN56298","WIN8989","WIN5628","WIN56256"};
        checkAllElements(map,autoWin);
    }
    @Test
    void testRemove_twoObjectInCells_UpElement() {
        OurHashMap<String, Auto> map = new OurHashMap<>();
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);
        assertEquals(map.remove("WIN74528"), opel);
        assertEquals(map.get("WIN8989"), bmw);
        assertEquals(map.size(), 8);

        String[] autoWin={"WIN4528","WIN56828","WIN56628","WIN56298","WIN8988","WIN8989","WIN5628","WIN56256"};
        checkAllElements(map,autoWin);
    }

    @Test
    void put_changeElement() {

        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto bmw1 = new Auto("pink", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN8988", bmw);
        map.put("WIN8988", bmw1);
        assertEquals(map.get("WIN8988"), bmw1);
        assertTrue(map.get("WIN8988") != bmw);


        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);

        map.put("WIN5628", audi);
        map.put("WIN5628", audi2);
        assertEquals(map.get("WIN5628"), audi2);
        assertTrue(map.get("WIN5628") != audi);
        assertEquals(map.size(), 7);

        String[] autoWin={"WIN4528","WIN56828","WIN74528","WIN56628","WIN56298","WIN8988","WIN5628"};
        checkAllElements(map,autoWin);
    }

    void checkAllElements(OurHashMap<String, Auto> mapCheck,String[] arrayStr){
        for (String elm:arrayStr) {
            // System.out.println(elm);
            assertTrue(mapCheck.get(elm)!=null);
        }
    }

    @Test
    public void testKeyIterator_emptyList() {
        Iterator iterator = map.keyIterator();

        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testKeyIterator_oneElement() {

        Auto opel = new Auto("grey", "Opel");
        map.put("WIN4528", opel);

        Iterator<String> iterator = map.keyIterator();

        int i = 0;
        while (iterator.hasNext()) {
            String key=iterator.next();
            System.out.println(key);
            assertEquals("WIN4528", key);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testGetContains_emptyObject_notExistKey() {
        assertNull(key.get(5));
    }

    @Test
    public void testForwardIterator_severalElements() {
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        Iterator<String> iterator = map.keyIterator();

        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            i++;
        }

        assertEquals(9, map.size());

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

}