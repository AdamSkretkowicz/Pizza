package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //pobranie informacji od uzytkownika o ilosci pizzy
        System.out.println("Wpisz Ilosc pizzy do porownania: ");
        Scanner wpiszIloscPizzy = new Scanner(System.in);
        int iloscPizz = wpiszIloscPizzy.nextInt();

        if (iloscPizz <= 0) {
            System.out.println("Wpisales niepoprawną ilosc, koncze program");
        } else {
            System.out.println("Wpisales " + iloscPizz + " do porownania, podaj ich parametry: [rozmiar(cm),cena]");

            Double[] tablicaObliczeniowa = new Double[iloscPizz];
            for (int i = 1; i <= iloscPizz; i++) {
                System.out.println("Podaj parametry dla " + i + " pizzy, rozmiar:");
                Scanner wpiszRozmiar = new Scanner(System.in);
                double rozmiarPizzy = wpiszRozmiar.nextInt();
                System.out.println("podaj cene:");
                Scanner wpiszCene = new Scanner(System.in);
                double cenaPizzy = wpiszCene.nextInt();
                System.out.println("Pizza nr " + i + " rozmiar: " + rozmiarPizzy + " cena: " + cenaPizzy);

                double wspolczynnik = (3.14*Math.pow((rozmiarPizzy/2),2)) / cenaPizzy;
                System.out.println("wspolczynnik :" + wspolczynnik);
                tablicaObliczeniowa[i - 1] = wspolczynnik;
            }
            double max = 0;
            int max_index = 0;
            for (int a = 0; a < tablicaObliczeniowa.length; a++) {
                if (tablicaObliczeniowa[a] > max) {
                    max = tablicaObliczeniowa[a];
                    max_index = a + 1;
                }
            }
            System.out.println("Wspolczynnik oplacalnosci : " + max + " posiada pizza nr : " + max_index);
        }
    }
}
