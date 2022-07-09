package com.freelance.beans;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "annonces")
public class Annonce implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @Column(name = "images", nullable = false)
    private LinkedList<String> annonceImages;
    
    private String image;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    public Annonce() {
    }

    public Annonce(String titre, String description, LinkedList<String> annonceImages) {
        this.titre = titre;
        this.description = description;
        this.annonceImages = annonceImages;
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

    public LinkedList<String> getAnnonceImages() {
        return annonceImages;
    }

    public void setAnnonceImages(LinkedList<String> annonceImages) {
        this.annonceImages = annonceImages;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    @Override
    public String toString() {
        return "Annonce{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", annonceImages=" + annonceImages +
                '}';
    }
}
