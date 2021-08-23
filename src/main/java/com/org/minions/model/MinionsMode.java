package com.org.minions.model;

import org.springframework.data.annotation.Id;

public class MinionsMode {
    @Id
    private Integer id;
    private String characters;
    private Integer perMarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public Integer getPerMarks() {
        return perMarks;
    }

    public void setPerMarks(Integer perMarks) {
        this.perMarks = perMarks;
    }
}
