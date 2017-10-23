/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neste;

/**
 *
 * @author Lauri
 */
public class Laskin {
    double ml;
    double nctn;
    double tiivari;
    private double mlNctn;
    private double mlTiivari;
    private double mlMl;
    
    
    public Laskin(double millilitra, double nikotiini, double tiiviste){
    ml = millilitra;
    nctn = nikotiini;
    tiivari = tiiviste;
    
    if(ml < 0)
        ml = 0;
    if (ml >100)
        ml=100;
    if(nctn > 10)
        nctn = 10;
    if (nctn < 0)
        nctn = 0;
    if (tiivari > 50)
        tiivari = 50;
    if (tiivari < 0)
        tiivari = 0;
    
    
    }
    
    public void laske(){
    mlNctn = nctn*ml;
    mlTiivari = tiivari*ml;
    mlMl = ml - mlTiivari - mlNctn;
    System.out.println( mlMl + "ml" + "\t" + "PG/VG nestettä");
    System.out.println(mlNctn + "ml" + "\t" + "Nikotiinia");
    System.out.println(mlTiivari + "ml" + "\t" + "Tiivistettä");
    
    
    
    }
}
