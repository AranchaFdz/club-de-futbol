package com.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.entities.FootballAssociation;

public interface FootballAssociationRepository extends JpaRepository<FootballAssociation, Long> {
}

