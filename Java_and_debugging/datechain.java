package org.example;

public class datechain {
    private class Node{
        DateImmuable date;
        Node pointeur;
        Node(DateImmuable date) {
            this.date = date;
            this.pointeur = null;
        }
    }
    private Node root;
    public datechain() {
        this.root=null;
    }
    public void inserer(DateImmuable newdate) {
        Node newpointeur=new Node(newdate);
        newpointeur.pointeur=root;
        root=newpointeur;
    }
    public void printlist(){
    if (root==null) {
        System.out.println("Ba y'a rien dedans");
    }else{
        Node savethedate=root;
        String laliste="";
        while (savethedate!=null){
        laliste=laliste + savethedate.date.getJour() +"/"+savethedate.date.getMois()+ "/"+savethedate.date.getAnnée() + " | ";
        savethedate=savethedate.pointeur;
        }
        System.out.println(laliste);
    }
    }
    public static void main(String[] args){
            datechain liste = new datechain();
            liste.inserer(new DateImmuable(10, 5, 2023));
            liste.inserer(new DateImmuable(29, 2, 2004));
            liste.inserer(new DateImmuable(1, 1, 1));
            /*try {
                liste.inserer(new DateImmuable(15, 13, 1969));
            }
            catch(IllegalArgumentException e){
            System.out.println("Erreur : " + e.getMessage());}*/
            liste.printlist();
    }
}
