/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lecomte;

import java.util.Scanner; //on importe le scanner d'une librairie

/**
 *
 * @author romai
 */
public class TP2_convertisseurObjet_LECOMTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperature;
        double indice;          // création de variables
        double resultat;
        
        Convertisseur conversion = new Convertisseur(); // on crée un objet dans la class conertisseur
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saissir la valeur de la temperature :");
        temperature = sc.nextDouble(); //insertion de la temperature
        System.out.println("quelle est la convertion que l'on va utiliser ? \n1. Celcius en Kelvin \n2. Kelvin en Celcius \n3. Farenheit en Celcius \n4. Celcius en Farenheit \n5. Farenheit en Kelvin \n6. Kelvin en Farenheit");
        indice = sc.nextDouble(); //insertion des indices donnes grace à la ligne précedente
        
        if (indice==1) {
            resultat = conversion.CelciusVersKelvin(temperature);
            System.out.println(resultat + " Kelvin");
        }
        if (indice==2) {
            resultat = conversion.KelvinVersCelcius(temperature);
            System.out.println(resultat + " Celcius");
        }
        if (indice==3) {
            resultat = conversion.FarenheitVersCelcius(temperature);
            System.out.println(resultat + " Celcius");
        }
        if (indice==4) {
            resultat = conversion.CelciusVersFarenheit(temperature);
            System.out.println(resultat + " Farenheit");
        }
        if (indice==5) {
            resultat = conversion.FarenheitVersKelvin(temperature);
            System.out.println(resultat + " Kelvin");
        }
        if (indice==6) {
            resultat = conversion.KelvinVersFarenheit(temperature);
            System.out.println(resultat + " Farenheit");
        }
        
}}
