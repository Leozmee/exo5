package org.example.exo5.entity;

import java.util.Date;
import java.util.List;

public class Consultation {
    private int id;
    private Date dateConsultation;
    private String nomMedecin;
    private String prescription;
    private List<FicheDeSoin> fichesDeSoins;
}
