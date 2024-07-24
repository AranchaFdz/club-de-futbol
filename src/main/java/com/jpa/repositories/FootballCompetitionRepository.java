package com.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.entities.FootballCompetition;

public interface FootballCompetitionRepository extends JpaRepository<FootballCompetition, Long> {
}
