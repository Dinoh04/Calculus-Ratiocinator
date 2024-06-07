package com.example.calculusrationator;

public class Généreux extends Proposition{
    public final Boolean valeur;

    public Généreux(Boolean valeur) {
        this.valeur = valeur;
    }

    @Override
    public Boolean évaluation() {
        return valeur;
    }
}
