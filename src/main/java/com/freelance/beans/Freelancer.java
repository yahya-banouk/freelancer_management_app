package com.freelance.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "freelancers")
public class Freelancer extends User {

    @OneToMany(mappedBy = "freelancer", fetch = FetchType.EAGER)
    private List<Annonce> annonces;

    public Freelancer(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public Freelancer(String name, String username, String email, String password) {
        super(name, username, email, password);
    }

    public Freelancer() {
    }

    public List<Annonce> getAnnonces() {
        return annonces;
    }
}
