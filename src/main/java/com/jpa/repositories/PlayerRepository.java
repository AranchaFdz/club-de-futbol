package com.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
