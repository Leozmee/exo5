package org.example.exo5.entity;

import java.util.Date;
import java.util.List;

public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String photo;
    private List<Consultation> consultations;

    public void setNom(String nom) {
    }

    public void setPrenom(String prenom) {

    }
}
