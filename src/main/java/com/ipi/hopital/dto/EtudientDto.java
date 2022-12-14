package com.ipi.hopital.dto;

import java.time.LocalDate;

public class EtudientDto {
    private String prenom;
    private String nom;
    private LocalDate date_naissance;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public EtudientDto(String prenom, String nom, LocalDate date_naissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.date_naissance = date_naissance;
    }
}
