package com.ftninformatika.cas_015;

public class Song {
    
    private String author;
    private String name;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song(String author, String name) {
        this.author = author;
        this.name = name;
        
    }
}
