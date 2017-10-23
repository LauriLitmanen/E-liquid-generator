/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neste;
import java.util.Scanner;




/**
 *
 * @author Lauri
 */
public class Neste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        Scanner input = new Scanner(System.in);
       
       
        
        
        System.out.println("Syötä haluamasi määrä millilitroina:");
        double millilitra = input.nextDouble();
        System.out.println("Syötä nikotiinipitoisuus prosentteina:");
        double nikotiini = input.nextDouble()/100;
        System.out.println("Syötä tiivisteen määrä prosentteina:");
        double tiiviste = input.nextDouble()/100;
        
        
        Laskin laskin = new Laskin(millilitra, nikotiini, tiiviste);
        
        laskin.laske();
    }
    
}
