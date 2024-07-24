package com.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.entities.Coach;

public interface CoachRepository extends JpaRepository<Coach, Long> {
}
