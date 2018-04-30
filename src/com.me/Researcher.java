package com.me;

public class Researcher implements IPerson {

    private String firstName;
    private String lastName;
    private String projects;

    public Researcher(String firstName, String lastName, String projects) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.projects = projects;

    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    public String projects() {
        return projects;
    }
}
