/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_lecomte;

/**
 *
 * @author romai
 */
public class TP2_manip_LECOMTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Tartiflette assiette1 = new Tartiflette(500); // creation de tartiflette
    Tartiflette assiette2 = new Tartiflette(600);
    assiette2.nbCalories = 100;
    Tartiflette assiette3 = assiette2 ; 
    
    System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories); //affichage du nombre de calories des assiettes
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
    
    //les assiettes 2 et 3 sont les memes
    
    assiette2 = assiette1;
    assiette1 = assiette3;
    
    Moussaka [] tab = new Moussaka[10]; //creation de tableau de 10 ref de Moussaka
    for (int i = 0; i < tab.length; i ++ ){
        tab[i] = new Moussaka (100 * (1 + i));
        if (i == tab.length - 1){
            System.out.println(tab[i]);
            }
        else {
            System.out.println(tab[i]);
        }
    }
}}
