package com.yomi_adt.bbx_2026_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "blader_name", nullable = false)
    private String bladerName;

    @Column(name = "ranked_points", nullable = false)
    private Integer rankedPoints = 0;

    @ManyToOne
    @JoinColumn(name = "guild_id", referencedColumnName = "guild_id")
    private Guild guild;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBladerName() {
        return bladerName;
    }

    public void setBladerName(String bladerName) {
        this.bladerName = bladerName;
    }

    public Integer getRankedPoints() {
        return rankedPoints;
    }

    public void setRankedPoints(Integer rankedPoints) {
        this.rankedPoints = rankedPoints;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }
}
