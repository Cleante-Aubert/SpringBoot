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
        
    }

}
