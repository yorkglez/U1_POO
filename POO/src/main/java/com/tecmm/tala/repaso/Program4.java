package com.tecmm.tala.repaso;

/**
 * Created by York on 2/20/2018.
 */

public class Program4 {
    public  static void Sethours(int hour){
        int result;
        if (hour == 0)
            result = 12;
        else
            result = hour - 12;
        System.out.println(result);
    }
}
