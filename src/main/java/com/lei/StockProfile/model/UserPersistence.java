package com.lei.StockProfile.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class UserPersistence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IDUSER")
    private int id;
    @Column(name="USERNAME")
    private String name;
    @Column(name="PASSWORD")
    private int pwd;
    @ManyToOne()
    @JoinColumn(name="PERSONID")
    @JsonIgnore
    private PersonPersistence person;

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

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public PersonPersistence getPerson() {
        return person;
    }

    public void setPerson(PersonPersistence person) {
        this.person = person;
    }
}
