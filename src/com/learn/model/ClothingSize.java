package com.learn.model;

public enum ClothingSize {
    S("Small"), M("Medium"), L("Large");

    private String descriptione;

    ClothingSize(String descriptione) {
        this.descriptione = descriptione;
    }

    @Override
    public String toString() {
        return descriptione;
    }
}
