package com.wenjing.clone;

public class Team implements Cloneable{
    String teamName;
    Person[] members;

    public Team(String teamName, Person[] members) {
        this.teamName = teamName;
        this.members = members;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow copy of the Team object itself
        Team clonedTeam = (Team) super.clone();

        // Deep copy member array
        clonedTeam.members = new Person[this.members.length];
        for (int i = 0; i < this.members.length; i++) {
            clonedTeam.members[i] = (Person) this.members[i].clone(); // Recursively clone members
        }
        return clonedTeam;
    }

    @Override
    public String toString() {
        return "Team{teamName='" + teamName + "', members=" + java.util.Arrays.toString(members) + '}';
    }
}

