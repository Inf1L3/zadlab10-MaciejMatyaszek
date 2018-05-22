/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Maciej
 */
public class zad4 {
    public static void zad4(){
    Random random = new Random();
    int blad = 0;
    int dzialania =0;
    do{
        double dzielenie;
        int a, b;
        a=random.nextInt(21)-10;
        b=random.nextInt(21)-10;
        try{
            dzielenie = a/b;
            System.out.println("Liczba obliczeń = " +dzialania+" Wynik dzielenia= "+dzielenie);
            dzialania++;
        }catch(ArithmeticException e){
            System.out.println("Wylosowan dzielnik 0");
            blad++;
            
        }
      }while(blad!=3);
}}
