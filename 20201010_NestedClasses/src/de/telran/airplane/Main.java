package de.telran.airplane;

public class Main {
    public static void main(String[] args) {
        System.out.println(Boeing737.Drawing.getCapacity());
        Boeing737.Drawing drawing = new Boeing737.Drawing(1);
        System.out.println(Boeing737.Drawing.Author.author);
        System.out.println(drawing);
        for (int i = 0; i < 5; i++) {
            Boeing737.Drawing drawing1 = new Boeing737.Drawing(i);
            System.out.println(drawing1);
        }
    }

    /*public static void displayOldestPerson(Person[] persons) {  //метод не выполняет свою задачу
        Person[] var1 = persons;                    //лишняя переменная + плохое имя
        int var2 = persons.length;                  //лишняя переменная + плохое имя
        for (int var3 = 0; var3 < var2; ++var3) {   //запутанный синтаксис
            Person p = var1[var3];                  //лишняя переменная
            System.out.println(p);
        }
    }*/
}
