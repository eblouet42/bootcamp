package org.example;

import java.util.Arrays;

public final class DateImmuable {
    private final int jour;
    private final int mois;
    private final int année;

    public DateImmuable(int jour, int mois, int année) {
        if (jour < 1||jour > 31||mois<1||mois > 12||(Arrays.asList(4, 6, 9, 11).contains(mois) && jour>30)||(mois==2 && ((jour>28 && année%4!=0)||(jour>29 && année%4==0)))){
        throw new IllegalArgumentException("Jour invalide");
        }
        this.jour = jour;
        this.mois = mois;
        this.année = année;
    }

    public int getJour() {
        return jour;
    }
    public int getMois() {
        return mois;
    }
    public int getAnnée() {
        return année;
    }

    public static void main(String[] args) {
        try{
            DateImmuable date1=new DateImmuable(15,7,2024);
            System.out.println("Date 1 : "+date1.getJour()+"/"+date1.getMois()+"/"+date1.getAnnée());
            DateImmuable date2 = new DateImmuable(29, 2, 2024);
            System.out.println("Date 2 : " + date2.getJour()+"/"+date2.getMois()+"/"+date2.getAnnée());
            DateImmuable date3 = new DateImmuable(31,4,2023);
            System.out.println("Date 3 : "+date3.getJour()+"/"+date3.getMois()+"/"+date3.getAnnée());
            DateImmuable date4 = new DateImmuable(30, 2, 2023);
            System.out.println("Date 4 : " + date4.getJour() + "/" + date4.getMois() + "/" + date4.getAnnée());
            DateImmuable date5 = new DateImmuable(10, 13, 2023);
            System.out.println("Date 5 : " + date5.getJour() + "/" + date5.getMois() + "/" + date5.getAnnée());
        }catch (IllegalArgumentException e){
            System.out.println("Erreur : " + e.getMessage());
        }
    }
};

