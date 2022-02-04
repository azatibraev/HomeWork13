package com.company;

public class Cat {
    private String name;
    private String color;
    private double height;
    private double weight;
    private String breedGroup;
    private int lifespan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreedGroup() {
        return breedGroup;
    }

    public void setBreedGroup(String breedGroup) {
        this.breedGroup = breedGroup;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void showInfo(){
        System.out.println(" Name of cats: " + name);
        System.out.println(" Color: " + color);
        System.out.println(" Height: " + height + "cm");
        System.out.println(" Weight: " + weight + "kg");
        System.out.println(" Breed Group: " + breedGroup);
        System.out.println(" Lifespan: " + lifespan + "years");
    }
}
