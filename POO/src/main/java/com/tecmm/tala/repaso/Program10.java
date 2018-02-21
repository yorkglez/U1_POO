package com.tecmm.tala.repaso;

/**
 * Created by York on 2/20/2018.
 */

public class Program10 {
    public void Setfactory(int number){
        long factory = 1;
        for (int i = number; i > 0; i--)
            factory = factory * i;
        System.out.println("El factorial de " + number + " es: " + factory);
    }
}
