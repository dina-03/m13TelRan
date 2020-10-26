import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        System.out.println(list);
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Ivan", "Maria", "Stepan", "John", "John", "Amalia");
        correctedNames1(names);
        System.out.println(names);
       /* List<String> newNames = correctedNames(names);
        System.out.println(newNames);*/

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,7,9,5,4));
        List<Integer> list2 = removeHigherThanNumber(list1,4);
        System.out.println(list1);
        System.out.println(list2);
    }

    private static List<String> correctedNames1(List<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == 4) {
                iterator.remove();
            }
        }
        return names;
    }

    private static List<String> correctedNames(List<String> names) {
        List<String> correctNames = new ArrayList<>();
        for (String n : names) {
            if (n.length() != 4) {
                correctNames.add(n);
            }
        }
        return correctNames;
    }

    public static List<String> checkTwoNumberList(List<Integer> num1, List<Integer> num2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            result.add(num1.get(i) == num2.get(i) ? "yes" : "no");
        }
        return result;
    }

    public static boolean isListCycleOfAnother(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            Collections.rotate(list1, 1);
            if (list1.equals(list2))
                return true;
        }
        return false;
    }

    public static List<Integer> reverseList(List<Integer> num) {
        List<Integer> reverseNumber = new ArrayList<>(num);
        Collections.reverse(reverseNumber);
        return reverseNumber;
    }

    public static List<String> mergedList(List<String> list1, List<String> list2){
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static List<Integer> removeHigherThanNumber(List<Integer> listNumbers, int number){
        List<Integer> editList = new ArrayList<>(listNumbers); //listNumber
        Iterator iterator = editList.iterator();
        while (iterator.hasNext()){
            int current =(int) iterator.next();
            if (current > number){
                iterator.remove();
            }
        }
        return editList;
    }
}
