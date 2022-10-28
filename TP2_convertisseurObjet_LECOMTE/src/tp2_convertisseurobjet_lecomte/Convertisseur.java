package tp2_convertisseurobjet_lecomte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur() {
        int nbConversions = 0; //definit l variable pour le nombre de conversion
    }
    
    public double CelciusVersKelvin (double tcelcius){ // 
        double tkelvin = tcelcius + 273.15; //calcul pour faire la conversion
        nbConversions +=1; // ajoute 1 au nombre de conversion
        return tkelvin;
    }

    public double KelvinVersCelcius (double tkelvin){
        double tcelcius = tkelvin - 273.15;
        nbConversions +=1;
        return tcelcius;
    }
    
    public double FarenheitVersCelcius (double tfarenheit){
        double tcelcius = (tfarenheit - 32) / 1.8 ;
        nbConversions +=1;
        return tcelcius;
    }
    
    public double CelciusVersFarenheit (double tcelcius){
        double tfarenheit = (tcelcius * 1.8) +32;
        nbConversions +=1;
        return tfarenheit;
    }
    
    public double FarenheitVersKelvin (double tfarenheit){
        double tkelvin = CelciusVersKelvin(FarenheitVersCelcius (tfarenheit));
        nbConversions -=1;
        return tkelvin;       
    }
        
    public double KelvinVersFarenheit (double tkelvin){
        double tfarenheit = CelciusVersFarenheit(KelvinVersCelcius (tkelvin));
        nbConversions -=1;
        return tfarenheit;
    }

    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}
