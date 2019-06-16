package com.learn.classesAndObjects.Enums;

public enum Book {
    // declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // instance fields // either declared private or no access specifiers at all
    private final String title;
    private final String copyrightYear;

    // enum constructor
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    // accessor for field title
    public String getTitle() {
        return title;
    }

    // accessor for field copyright year
    public String getCopyrightYear() {
        return copyrightYear;
    }
}
