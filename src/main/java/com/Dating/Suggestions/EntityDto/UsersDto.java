package com.Dating.Suggestions.EntityDto;

import java.util.List;

public class UsersDto {
    private Integer id;
    private String name;
    private String gender;
    private int age;
    private List<InterestDto> interest;

    public UsersDto(Integer id, String name, String gender, int age, List<InterestDto> interest) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.interest = interest;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<InterestDto> getInterest() {
        return interest;
    }

    public void setInterest(List<InterestDto> interest) {
        this.interest = interest;
    }
}
