package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADOR DE NUMEROS PRIMOS");
        System.out.println("============================\n");

        Integer inf = 1;
        Integer sup = 0;

        while(true){
            System.out.println("Introduzca el limite inferior: ");
            inf = sc.nextInt();

            if(inf==0) System.exit(0);

            System.out.println("Introduzca el limite superior: ");
            sup = sc.nextInt();

            if(sup==0) System.exit(0);

            if(inf>=sup){
                System.out.println("ERROR: El limite superior debe ser mayor que el inferior.");
            } else {

                ArrayList<Integer> primos = Utils.intervaloPrimos(inf, sup);

                System.out.println("Se han encontrado "+primos.size()+" en el intervalo");
                primos.forEach( (p)->{
                    System.out.println(p);
                });
                System.out.println();
            }
        }
    }
}