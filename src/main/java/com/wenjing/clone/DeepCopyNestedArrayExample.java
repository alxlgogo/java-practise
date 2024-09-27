package com.wenjing.clone;

public class DeepCopyNestedArrayExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person[] members = {new Person("Alice", 30), new Person("Bob", 25)};
        Team team = new Team("Developers", members);

        // clone team
        Team clonedTeam = (Team) team.clone();

        // Modify the cloned data without affecting the original data
        clonedTeam.teamName = "QA";
        clonedTeam.members[0].name = "Charlie";

        // Output information about the original team and the cloned team
        System.out.println("Original: " + team);
        System.out.println("Cloned: " + clonedTeam);
    }
}
