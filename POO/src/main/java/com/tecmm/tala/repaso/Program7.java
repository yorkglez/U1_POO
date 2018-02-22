package com.tecmm.tala.repaso;

/**
 * Created by York on 2/20/2018.
 */

public class Program7 {
    public void Getnumbers(double number){
        if (number > 0 && number < 8){
            String result = "";
            if (number == 1)
                result = "I";
            if (number == 2)
                result = "II";
            if (number == 3)
                result = "III";
            if (number == 4)
                result = "IV";
            if (number == 5)
                result = "V";
            if (number == 6)
                result = "VI";
            if (number == 7)
                result = "VII";
            System.out.println(result);
        }
        else
            System.out.println("Error!");
    }
}
