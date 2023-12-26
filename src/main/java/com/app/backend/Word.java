package com.app.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "${DB_TABLE_NAME}")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Hindi")
    private String hindi_word;

    @Column(name = "English")
    private String english_meaning;

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHindi_word() {
        return hindi_word;
    }

    public void setHindi_word(String hindi_word) {
        this.hindi_word = hindi_word;
    }

    public String getEnglish_meaning() {
        return english_meaning;
    }

    public void setEnglish_meaning(String english_meaning) {
        this.english_meaning = english_meaning;
    }
}
