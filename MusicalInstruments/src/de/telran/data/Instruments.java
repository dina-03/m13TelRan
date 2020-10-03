package de.telran.data;

public interface Instruments {
    void play();

    static Instruments createObject(String name, int character){
        switch (character){
            case 1: return new Guitar(name);
            case 2: return new Drum(name);
            case 3: return new Trumpet(name);
            case 4: return new Piano(name);
            default: return null;
        }
    }

    public static void split(){
        System.out.println("------------");
    }
}
