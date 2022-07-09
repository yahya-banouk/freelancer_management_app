package com.freelance.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin extends User {
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public Admin() {
    }
}
