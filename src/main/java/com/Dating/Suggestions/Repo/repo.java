package com.Dating.Suggestions.Repo;

import com.Dating.Suggestions.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repo extends JpaRepository<Users, Integer> {
}
