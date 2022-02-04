package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setName(" ZANDER ");
        fish.setColor(" Green-Brown");
        fish.setWeight(19.6);
        fish.setDescription(" The zander is the largest member of the Percidae and it has a long,muscular body.");
        fish.setDistribution(" The zander is very widely distributed across Eurasia." );

        fish.showInfo();

        System.out.println();

        Parrot parrot = new Parrot();

        parrot.setDescription(" Parrots are members of the order Psittaciformes. ");
        parrot.setWeight(1.6);
        parrot.setSize(1.15);
        parrot.setHabitat(" Most wild parrots live in the warm areas of the Southern Hemisphere");

        parrot.showInfo();

        System.out.println();

        Cat cat = new Cat();

        cat.setName(" GOOFY ");
        cat.setColor(" Bright orange to light brown, with dark spots or a distinctive marbling pattern ");
        cat.setHeight(36.9);
        cat.setWeight(3.9);
        cat.setBreedGroup("Bengal Cats are curious and confident with the tameness of a " +
                "domestic tabby and the beauty of an Asian Leopard Cat");
        cat.setLifespan(16);

        cat.showInfo();

        System.out.println();

        Dog dog = new Dog();

        dog.setName("German Shepherd ");
        dog.setColor(" Black and tan");
        dog.setHeight(25.8);
        dog.setWeight(94.7);
        dog.setBreedGroup("Herding Dogs");
        dog.setLifespan(14);

        dog.showInfo();
    }
}