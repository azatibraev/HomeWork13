package com.company;

public class Parrot {
    private String description;
    private double weight;
    private double  size;
    private String habitat;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void showInfo(){
        System.out.println(" Description about parrots: " + description);
        System.out.println(" Weight: " + weight + " kg ");
        System.out.println(" Size: " + size + " cm ");
        System.out.println(" Habitat: " + habitat);
    }
}
