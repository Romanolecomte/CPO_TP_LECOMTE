/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture (String modele, String marque, int puissanceCV ){
        Modele = modele;
        Marque = marque;
        PuissanceCV = puissanceCV;
    }
    @Override
    public String toString () { //retourne la chaine e caractere qu'on veut afficher de l'objet 
        String chaine_a_retourner;
        chaine_a_retourner = "\nModele : " + Modele + "\nMarque : " + Marque + "\nPuissanceCV : " + PuissanceCV;
        return chaine_a_retourner;
}
}
