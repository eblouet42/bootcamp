package org.example;

import java.util.Arrays;

public class Flot_de_contrôle {
    public static void main(String[] args) {
        System.out.println(PGCD(1230, 2460) + "");
        System.out.println(PGCD(4793891, 10283641)+"");
        int[] X=Trinsertion(new int[]{4, 2, 8, 1, 0, 198, 22, 24, 321, 21});
        System.out.println(Arrays.toString(X));
    }
    public static int PGCD(int a, int b) {
        if(a==b){
            return a;
        }
        else{
            if(a>b){
                return PGCD(a-b,b);
            }
            else{
                return PGCD(a,b-a);
            }
        }
    }
    public static int[] Trinsertion(int[] tab){
        for (int i = 1; i < tab.length; i++) {
            int valeuraplacer = tab[i];
            int curseur = i;
            boolean placer = false;
            while (!placer) {
                if (curseur == 0 || valeuraplacer > tab[curseur - 1]) {
                    tab[curseur] = valeuraplacer;
                    placer = true;
                } else {
                    tab[curseur] = tab[curseur - 1];
                    curseur--;
                }
            }
        }
        return tab;
    }
}