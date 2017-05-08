/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informel.mathe1;
import java.io.*;


/**
 *
 * @author Tobias
 */
public class KomplexeZahl implements Serializable
{
    private double realteil;
    private double imaginaerteil;
    private double radius;
    private int winkel;
    
    
    public KomplexeZahl(double realteil, double imaginaerteil, double radius, int winkel)
    {
        this.realteil = realteil;
        this.imaginaerteil = imaginaerteil;
        this.radius = radius;
        this.winkel = winkel;
    }
   
    public KomplexeZahl(double realteil, double imaginaerteil)
    {
        this.realteil = realteil;
        this.imaginaerteil = imaginaerteil;
    }
    
    public KomplexeZahl(double radius, int winkel)
    {
        this.radius = radius;
        this.winkel = winkel;
    }

    public double getRealteil()
    {
        return realteil;
    }
    
    public double getImaginaerteil()
    {
        return imaginaerteil;
    }
    
    public double getRadius()
    {
        return radius;
    }
     
    public int getWinkel()
    {
        return winkel;
    }
      
    public void setRealteil(double newRealteil) {
        realteil = newRealteil;
    }
    
    public void setImaginaerteil(double newImaginaerteil) {
        imaginaerteil = newImaginaerteil;
    }
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
     
    public void setWinkel(int newWinkel) {
        winkel = newWinkel;
    }
}
/*
public Event(int day, int month, int year, String name){
      eventTime = new Date(day, month, year);
      eventName = name;
   }

   public Event(int month, int year, String name){
      this(0, month, year, name); // hier
   }

   public Event(int year, String name){
      this(0, 0, year, name); // und hier
   }
 
*/