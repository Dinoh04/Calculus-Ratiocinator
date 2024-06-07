package com.example.calculusrationator;

public class Affirmation extends Proposition{
    public final Boolean valeur;

    public Affirmation(Boolean valeur) {
        this.valeur = valeur;
    }

    @Override
    public Boolean évaluation() {
        return valeur;
    }
}
