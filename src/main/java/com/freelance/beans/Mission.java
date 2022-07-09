package com.freelance.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;


@Entity
@Table(name = "missions")
public class Mission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @Column(name = "images", nullable = false)
    private LinkedList<String> missionImages;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Mission() {
    }

    public Mission(String titre, String description, LinkedList<String> missionImages) {
        this.titre = titre;
        this.description = description;
        this.missionImages = missionImages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<String> getMissionImages() {
        return missionImages;
    }

    public void setMissionImages(LinkedList<String> missionImages) {
        this.missionImages = missionImages;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", missionImages=" + missionImages +
                '}';
    }
}
