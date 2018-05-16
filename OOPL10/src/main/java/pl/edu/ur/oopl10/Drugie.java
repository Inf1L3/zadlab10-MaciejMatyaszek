/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class Drugie {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int liczby[] = { 1, 2, 3, 4, 5 };
 
    try
    {
      int wyswietl = liczby[8];                          
      System.out.println("Liczba to: " + wyswietl);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Liczba poza tablica "  );
    }
    }
    
}

