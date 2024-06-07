package com.example.calculusrationator;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestPourAffirmation {
    @Test
    void louEstPauvreEtGénéreux() {
        var Lou = new NomDeLaPersonne("Lou");
        var Généreux = new Généreux(true);
        var Pauvre = new Pauvre();
        assertFalse(LogicEtOu.Et(Pauvre.évaluation(), Généreux.évaluation()));
    }

    @Test
    void LouEstBeauDoncLouEstPauvre(){
        var lou = new NomDeLaPersonne("Lou");
        var Beau = new Beau();
        var Pauvre = new Pauvre();
        assertFalse(LogicEtOu.Affirmation(Beau.évaluation(), Pauvre.évaluation()));
    }

    @Test
    void LouEstPauvreDoncLouEstGénéreux(){
        var lou = new NomDeLaPersonne("Lou");
        var Pauvre = new Pauvre();
        var Généreux = new Généreux(true);
        var GénéreuxFaux = new Généreux(false);
        assertTrue(LogicEtOu.Affirmation(Pauvre.évaluation(), Généreux.évaluation()));
        //On test aussi si lou n'est pas généreux
        assertFalse(LogicEtOu.Affirmation(Pauvre.évaluation(), GénéreuxFaux.évaluation()));
    }

    @Test
    void LouEstBeauOuLouEstGénéreuxDoncLouEstPauvre(){
        var lou = new NomDeLaPersonne("Lou");
        var Beau = new Beau();
        var Généreux = new Généreux(true);
        var Pauvre = new Pauvre();
        assertFalse(LogicEtOu.Affirmation(LogicEtOu.Ou(Beau.évaluation(), Généreux.évaluation()), Pauvre.évaluation()));
    }

    @Test
    void  LouEstPauvreOuLouEstGénéreux (){
        var lou = new NomDeLaPersonne("Lou");
        var Pauvre = new Pauvre();
        var Généreux = new Généreux(true);
        assertTrue(LogicEtOu.Ou(Pauvre.évaluation(), Généreux.évaluation()));
    }
}
