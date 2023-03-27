package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        
        Voiture voiture1 = new Voiture();

        int resultat = voiture1.getPrix();
        int res = 0;
        Assert.isTrue(resultat==res,"Le prix n'est pas égal");   
        
        Voiture voiture2 = new Voiture("Ferrari",100000);
        String marque2 = voiture2.getMarque();
        Assert.isTrue(marque1.equals(marque2),"Pas la même marque");
        // Retourne une erreur ici comme marque1 = null et marque2 = ferrari

        
    }

}
