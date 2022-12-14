package com.ipi.hopital.dto;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class EtudiantDTO {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public EtudiantDTO(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public int calculerAge(){
        return LocalDate.now().getYear() - dateNaissance.getYear();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
