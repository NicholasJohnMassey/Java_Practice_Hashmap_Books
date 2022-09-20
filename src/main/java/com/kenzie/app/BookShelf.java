package com.kenzie.app;

import java.util.HashMap;

public class BookShelf {
    //declare properties
    private String category;
    private HashMap<String, String> bookMap;

    //declare constructors
    public BookShelf() {
        this.category = "";
        this.bookMap = new HashMap<>();
    }

    public BookShelf(String category){
        this.category = category;
        this.bookMap = new HashMap<>();
    }

    //declare methods


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HashMap<String, String> getBookMap() {
        return bookMap;
    }

    public void setBookMap(HashMap<String, String> bookMap) {
        this.bookMap = bookMap;
    }
}
