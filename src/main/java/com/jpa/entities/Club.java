package com.jpa.entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "clubs")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "club", fetch = FetchType.EAGER)
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "id_football_association")
    private FootballAssociation footballAssociation;

    @ManyToMany(targetEntity = FootballCompetition.class, fetch = FetchType.LAZY)
    @JoinTable(name = "club_competitions", joinColumns = @JoinColumn(name = "club"), inverseJoinColumns = @JoinColumn(name = "competition"))
    private List<FootballCompetition> footballCompetition;
}
