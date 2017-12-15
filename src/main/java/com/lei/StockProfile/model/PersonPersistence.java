package com.lei.StockProfile.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PERSON")
public class PersonPersistence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IDPERSOM")
    private int id;
    @Column(name="FULLNAME")
    private String name;
    @Column(name="AGE")
    private int age;
    @Column(name="USERCITY")
    private String city;
    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<UserPersistence> users=new HashSet<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<UserPersistence> getUsers() {
        return users;
    }

    public void setUsers(Set<UserPersistence> users) {
        this.users = users;
    }
}
