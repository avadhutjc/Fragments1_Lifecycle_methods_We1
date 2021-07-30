package com.masai.fragments_1_lifecycle_methods_we1;

public class Animal {
    private final String name;
    private final int imageId;

    public Animal(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
