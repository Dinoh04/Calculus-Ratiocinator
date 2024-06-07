package com.example.calculusrationator;

public class LogicEtOuAffirmation {

    public static Boolean Et(Boolean a, Boolean b){
      return  a && b;
    }

    public static  Boolean Ou(Boolean a, Boolean b){
        return a||b;
    }
    public static Boolean Affirmation(Boolean a, Boolean b){
        return !a && b;
    }
}
