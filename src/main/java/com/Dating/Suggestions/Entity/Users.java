package com.Dating.Suggestions.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uName;
    private String uGender;
    private int uAge;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Interest> uInterest;

    public Users(int id,String uName, String uGender, int uAge, List<Interest> uInterest) {
        this.id=id;
        this.uName = uName;
        this.uGender = uGender;
        this.uAge = uAge;
        this.uInterest = uInterest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public List<Interest> getuInterest() {
        return uInterest;
    }

    public void setuInterest(List<Interest> uInterest) {
        this.uInterest = uInterest;
    }
}
