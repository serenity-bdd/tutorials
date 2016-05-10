package net.serenitybdd.tutorials.model;

/**
 * Created by john on 9/05/2016.
 */
public enum Category {
    Motors("Motors"),
    Fashion("Fashion"),
    HomeAndGarden("Home & Garden");

    Category(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }
}
