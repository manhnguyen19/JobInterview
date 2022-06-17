package com.example.JobInterview.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Framework")
public class Framework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "programming_language_framework",
            joinColumns = @JoinColumn(name = "framework_id"),
            inverseJoinColumns = @JoinColumn(name = "programming_language_id")
    )
    private Set<ProgrammingLanguage> languages;

    public Framework() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProgrammingLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<ProgrammingLanguage> languages) {
        this.languages = languages;
    }
}
