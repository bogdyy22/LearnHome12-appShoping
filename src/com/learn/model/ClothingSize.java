package com.learn.model;

public enum ClothingSize {
    //am atasat la accesul modifiar descrierea
    S("Small"), M("Medium"), L("Large");

    private String descriptione;

    //avem constructorul la descriptione
    ClothingSize(String descriptione) {
        this.descriptione = descriptione;
    }

    //avem toStringul la enum
    @Override
    public String toString() {
        return descriptione;
    }
}
