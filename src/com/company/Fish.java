package com.company;

public class Fish {
    private String name;
    private String color;
    private double weight;
    private String description;
    private String distribution;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public void showInfo() {
        System.out.println(" Name of fish: " + name);
        System.out.println(" Color of fish: " + color);
        System.out.println(" Weight of fish: " + weight + " kg");
        System.out.println(" Description: " + description);
        System.out.println(" Distribution: " + distribution);
    }
}
