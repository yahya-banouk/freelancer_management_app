package com.freelance.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends User {
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Mission> missions;

    public Client(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public Client(String name, String username, String email, String password) {
        super(name, username, email, password);
    }

    public Client() {
    }
}
