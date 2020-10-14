package de.telran.app;

import de.telran.data.*;

public class ZooApp {
    public static void main(String[] args) {
        Birds parrots = new Birds("Parrots - Micropsitta", Color.BLUEYELLOW,
                16, "New Guinea", 0.42, 0.06, 10.0);
        Birds heron = new Birds("Heron Tigrisoma fasciatum", Color.GREYBROWN, 15,
                "Central and South America", 1.3, 1.2, 75.0);
        Birds swan = new Birds("Swan", Color.WHITE, 28, "Europe, Asia, America",
                15.0, 2.9, 1.8);
        Birds eagl = new Birds("Eagle", Color.BROWN, 20, "Eurasia, africa, north america",
                5.5, 2.4, 0.75);
        Birds owl = new Birds("Owl - elf", Color.GREYBROWN, 4,
                "North america", 0.44, 0.36, 0.14);
        Birds penguin = new Birds("Penguin - Aptenodytes forsteri", Color.BLACKWHITE, 19,
                "Antarctica", 35.0, 0.7, 115.0);

        Fish shark = new Fish("Shark - Tiger shark", Color.GREYWHITE, 13,
                "tropical and subtropical waters", 600.0, 500.0);
        Fish skat = new Fish("Skat - electric stingray", Color.BROWNWHITE, 25,
                "tropical and subtropical waters", 300.0, 450.0);
        Fish dolphin = new Fish("Dolphin - Stenella frontalis", Color.GREYBLUEWHITE, 26,
                "temperate and tropical waters Atlantic Ocean", 110.0, 230.);
        Fish goldfish = new Fish("Goldefish - Carassius auratus", Color.GOLD, 21,
                "water reservoirs in Central Asia, China, Japan", 0.08, 11.0);
        Fish catfish = new Fish("Catfish - Silurus glanis", Color.BROWNGREYGREEN, 80,
                "Europe, Arctic Ocean, Aral Sea", 400.0, 500.0);

        Reptiles snake = new Reptiles("Snake - anaconda", Color.GREYGREEN, 6, "South America's tropics", 85.0, 600.0);
        Reptiles tortoise = new Reptiles("Turtle -Testudines", Color.GREYBROWN, 120, "tropical and temperate climate " +
                "zones almost all over the Earth", 916.0, 260.0);
        Reptiles lizard = new Reptiles("Lizard - Iguania - Blue Cyclone", Color.BLUEGREEN, 20,
                "Greater Cayman Islands in the Caribbean Sea", 14.0, 152.0);
        Reptiles crocodile = new Reptiles("Crocodile - Gavialis gangeticus", Color.BROWNGREYGREEN, 29, "Indo-Gangetic" +
                "Plain and northern part of the Hindustan Peninsula", 181.0, 610.0);
        Reptiles frog = new Reptiles("Frog -Conraua goliath", Color.BROWNGREEN, 15, "southwest Cameroon and " +
                "Equatorial Guinea", 330.0, 81.0);

        Herbivores elephant = new Herbivores("Elephant - Asian elephant(Indian)", Color.GREY, 10,
                "Asian", 5500.0, 3.5);
        Herbivores antelope = new Herbivores("Antelope - Antilopinae", Color.WHITWBROWNGREY, 18,
                "African and Asian", 940.0, 2.0);
        Herbivores giraffe = new Herbivores("Giraffe - Giraffa camelopardalis", Color.YELLOWBROWN, 18,
                "savannahs in eastern and southern Africa", 1200.0, 6.1);
        Herbivores zebra = new Herbivores("Zebra - Hippotigris", Color.BLACKWHITE, 40, "Africa",
                400.0, 1.5);
        Herbivores hare = new Herbivores("Hare - Lepus timidus", Color.GREY, 2,
                "Common everywhere except Australia and Antarctica", 4.5, 1.5);

        Raptors wolf = new Raptors("Wolf - Canis lupus)", Color.GREY, 8, "Eurasia and North America", 100.0, 0.90);
        Raptors bear = new Raptors("Grizzly bear", Color.BROWN, 29, "Alaska and Canada", 450.0, 3.0);
        Raptors lion = new Raptors("Lion - Panthera leo", Color.BROWN, 25, "Africa, Middle East, Asia and Europe",
                250.0, 3.0);
        Raptors tiger = new Raptors("Tiger - Panthera tigris bengalensis", Color.BROWN, 15,
                "Pakistan, Eastern Iran, Northern and Central India", 388.7, 1.2);
        Raptors hyaena = new Raptors("Hyaena - Hyaenidae - Crocuta crocuta", Color.BROWN, 12, "Africa",
                69.0, 0.80);

        Raptors[] raptors = {wolf, bear, lion, tiger, hyaena};
        Herbivores[] herbivores = {elephant, antelope, giraffe, zebra, hare};
        Reptiles[] reptiles = {snake, tortoise, lizard, crocodile, frog};
        Fish[] fish = {shark, skat, dolphin, goldfish, catfish};
        Birds[] birds = {parrots, heron, swan, eagl, owl, penguin};

        Animals[] animals = {parrots, heron, swan, eagl, owl, penguin, shark, skat, dolphin, goldfish, catfish, snake,
                tortoise, lizard, crocodile, frog, elephant, antelope, giraffe, zebra, hare, wolf, bear, lion, tiger,
                hyaena};

       /* Reptiles.displayReptileLongevity(reptiles);
        Animals.split();
        Reptiles.displayLongestReptile(reptiles);
        Animals.split();
        Raptors.displayLongevityRaptor(raptors);
        Animals.split();
        Birds.displayLightestBird(birds);
        Animals.split();
        Birds.displayTheWidestWingspanBird(birds);
        Animals.split();
        System.out.println("All fish:");
        Animals.printArray(fish);
        System.out.println("Display All fish in the list:");
        Fish.displayFish(fish);
        Animals.split();
        System.out.println("animals by color:");
        Animals.printArray(Animals.getAnimalsByColor(animals, Color.YELLOWBROWN));
        System.out.println("animals by type: ");
        Animals.printArray(Animals.getAnimalsByType(animals, "raptors"));
        System.out.println("display all raptors:");
        Raptors.displayRaptors(raptors);
        Animals.split();*/
       System.out.println(Herbivores.findHerbivoresByWeight(herbivores));
    }
}
