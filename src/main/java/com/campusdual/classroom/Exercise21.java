package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {

        Set<String> elements = new HashSet<>();

        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");

        return elements;

    }

    public static Set<String> createTreeSet() {

        Set<String> elements = new TreeSet<>();

        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");

        return elements;
    }

    private static void printSet(Set<String> customSet) {
        for(String s: customSet) {
            System.out.println(s);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        set.add(elementToAdd);
        return true;
    }

    public static void main(String[] args) {

        createHashSet();
        createTreeSet();

        String elementToAdd = "ELEMENT AAA";
        addElementToSet(createHashSet(), elementToAdd);
        addElementToSet(createTreeSet(), elementToAdd);
        printSet(createHashSet());
        printSet(createTreeSet());



    }

}
