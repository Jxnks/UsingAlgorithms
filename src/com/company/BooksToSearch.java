package com.company;

public class BooksToSearch {
    private int id;
    private String name;

    public BooksToSearch(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}

