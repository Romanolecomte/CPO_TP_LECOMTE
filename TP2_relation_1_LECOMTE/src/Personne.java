/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Personne {
    String Nom;
    String Prenom;  //creation des varaiables
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne (String nom, String prenom){
        Nom = nom;
        Prenom = prenom;
        liste_voitures = new Voiture[3];    //  creation d un tableau
    }
    @Override
    public String toString () { //retourne la chaine e caractere qu'on veut afficher de l'objet 
        String chaine_a_retourner;
        chaine_a_retourner = "\nNom : " + Nom + "\nPrenom : " + Prenom + "\nNombre de Voiture : " + nbVoitures;
        return chaine_a_retourner;
    }
    public boolean ajouter_voiture (Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Proprietaire!=null){
            System.out.println(voiture_a_ajouter + "deja prise");
            return false;
        }   
            else{
                if (this.nbVoitures == 3){
                    System.out.println(this.Nom + this.Prenom + "a déja 3 voitures");
                    return false;
                }
                else {
                    this.liste_voitures[nbVoitures] = voiture_a_ajouter;
                    nbVoitures += 1;
                    return true;
                }
        }
            
            
    }
    
}