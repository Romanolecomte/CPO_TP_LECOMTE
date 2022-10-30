package tp2_manip_lecomte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Moussaka { // on creer une classe 
    int nbCalories;
    public Moussaka(int nbCalories2) { // analyse l'attribut nbCalories
    nbCalories = nbCalories2;
}
@Override
public String toString () { //retourne la chaine e caractere qu'on veut afficher de l'objet 
 return String.valueOf(nbCalories);
}}