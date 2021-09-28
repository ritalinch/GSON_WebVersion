package com.example.json_try3;

import java.util.Arrays;

public class Person {
    Book[] books = new Book[]{};
    String shop;

    @Override
    public String toString() {
        return "Person{" +
                "books=" + Arrays.toString(books) +
                ", shop='" + shop + '\'' +
                '}';
    }
}
