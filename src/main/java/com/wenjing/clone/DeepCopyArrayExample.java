package com.wenjing.clone;

public class DeepCopyArrayExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create an array of objects
        Person[] persons = {new Person("Alice", 30), new Person("Bob", 25)};

        //Create target array
        Person[] clonedPersons = new Person[persons.length];

        // Make a deep copy of each object
        for (int i = 0; i < persons.length; i++) {
            clonedPersons[i] = (Person) persons[i].clone();
        }

        // Modify the cloned array without affecting the original array
        clonedPersons[0].name = "Charlie";

        // print out
        System.out.println("Original: " + java.util.Arrays.toString(persons));
        System.out.println("Cloned: " + java.util.Arrays.toString(clonedPersons));
    }
}
