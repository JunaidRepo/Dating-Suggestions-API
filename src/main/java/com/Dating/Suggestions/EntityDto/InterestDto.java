package com.Dating.Suggestions.EntityDto;

import java.util.List;

public class InterestDto {
    private Integer id;
    private String interest;

    public InterestDto(Integer id,String interest) {
        this.id=id;
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
