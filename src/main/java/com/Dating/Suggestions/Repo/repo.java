package com.Dating.Suggestions.Repo;

import com.Dating.Suggestions.Entity.Intrest_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repo extends JpaRepository<Intrest_Details, Integer> {
}
