package com.yomi_adt.bbx_2026_backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participant_id")
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player;

    @ElementCollection
    @CollectionTable(name = "participant_beys", joinColumns = @JoinColumn(name = "participant_id"))
    @Column(name = "bey")
    private List<String> beys;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<String> getBeys() {
        return beys;
    }

    public void setBeys(List<String> beys) {
        this.beys = beys;
    }
}
