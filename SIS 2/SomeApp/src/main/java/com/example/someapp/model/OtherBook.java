package com.example.someapp.model;

public class OtherBook implements Printable {

    @Override
    public String print(String book) {
        return String.format("Oh, you made a mistake. The correct name is \"Leviathan\", and you entered - %s", book);
    }

}
