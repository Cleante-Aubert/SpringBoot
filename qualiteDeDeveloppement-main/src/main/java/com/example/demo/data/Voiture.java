package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
    int id;
    private String marque;
    private int prix;


    // Constructeurs
    public Voiture(){}

    public Voiture(String marque, int prix){ this.marque=marque;  this.prix=prix; }

    // Extention conseillée pour éviter de faire tt les getter, setter et constructeurs !!
    lombock

    // Set et get marque
    private String getMarque(){ return marque; }

    private void setMarque(String marque){ this.marque = marque; }

    // Set et get prix
    private int getPrix(){ return prix; }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    // Set et get id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
