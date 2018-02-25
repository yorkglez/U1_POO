package com.tecmm.tala.principal;

import com.tecmm.tala.repaso.Program1;
import com.tecmm.tala.repaso.Program10;
import com.tecmm.tala.repaso.Program2;
import com.tecmm.tala.repaso.Program3;
import com.tecmm.tala.repaso.Program4;
import com.tecmm.tala.repaso.Program5;
import com.tecmm.tala.repaso.Program6;
import com.tecmm.tala.repaso.Program7;
import com.tecmm.tala.repaso.Program8;
import com.tecmm.tala.repaso.Program9;
import java.util.Scanner;
/**
 * Created by York on 2/25/2018.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Menu\n1.- Program 1" +
                "\n2.- Program 2" +
                "\n3.- Program 3" +
                "\n4.- Program 4" +
                "\n5.- Program 5" +
                "\n6.- Program 6" +
                "\n7.- Program 7" +
                "\n8.- Program 8" +
                "\n9.- Program 9" +
                "\n10.- Program 10" +
                "\nSeleccione un programa: ");
        int op = in.nextInt();
        float n1,n2;
        switch (op){
            case 1://Program 1
                Program1 P1 = new Program1();
                System.out.print("Ingrese base: ");
                n1 =  in.nextFloat();
                System.out.print("Ingrese altura: ");
                n2 =  in.nextFloat();
                P1.SetArea(n1, n2);
                break;
            case 2://Program 2
                Program2 P2 = new Program2();
                System.out.print("Ingrese precio del articulo: ");
                n1 =  in.nextFloat();
                P2.Setprice(n1);
                break;
            case 3://Program 3
                Program3 P3 = new Program3();
                System.out.print("Ingrese Grados C: ");
                n1 =  in.nextFloat();
                P3.Getgrades(n1);
                break;
            case 4://Program 4
                Program4 P4 = new Program4();
                System.out.print("Ingrese Hora: ");
                n1 =  in.nextFloat();
                P4.Sethours((int)n1);
                break;
            case 5://Program 5
                Program5 P5 = new Program5();
                System.out.print("Ingrese numero: ");
                n1 =  in.nextFloat();
                P5.Getnumber(n1);
                break;
            case 6://Program 6
                Program6 P6 = new Program6();
                System.out.print("Ingrese numero: ");
                n1 =  in.nextFloat();
                P6.Gettypenumber(n1);
                break;
            case 7://Program 7
                Program7 P7 = new Program7();
                System.out.print("Ingrese numero: ");
                n1 =  in.nextFloat();
                P7.Getnumbers(n1);
                break;
            case 8://Program 8
                Program8 P8 = new Program8();
                System.out.print("Ingrese nombre: ");
                String name = in.next();
                System.out.print("Cuantas veces quieres repetir el nombre: ");
                n1 = in.nextFloat();
                P8.Getname(name,(int)n1);
                break;
            case 9://Program 9
                Program9 P9 = new Program9();
                P9.Setnumbers();
                break;
            case 10://Program 10
                Program10 P10 = new Program10();
                System.out.print("Ingrese numero: ");
                n1 =  in.nextFloat();
                P10.Setfactory((int)n1);
                break;
        }
    }
}
