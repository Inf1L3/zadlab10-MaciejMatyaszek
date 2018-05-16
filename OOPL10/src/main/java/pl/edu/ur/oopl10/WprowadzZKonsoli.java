/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    Scanner odczyt = new Scanner(System.in);
    void wprowadzInt() {
        int liczba;
        try {
            liczba=odczyt.nextInt();
            
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
        odczyt.next();
        }
    void wprwoadzString(){
        String tekst;
        try{
            tekst=odczyt.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
    }
     void wprwoadzFloat(){
        float liczba;
        try{
            liczba=odczyt.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
        odczyt.next();
    }
     void wprwoadzDouble(){
        double liczba;
        try{
            liczba=odczyt.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
        odczyt.next();
    }
     void wprwoadzLong(){
        long liczba;
        try{
            liczba=odczyt.nextLong();
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
        odczyt.next();
    }
        void wprwoadzShort(){
        short liczba;
        try{
            liczba=odczyt.nextShort();
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
        odczyt.next();
}
        void wprwoadChar(){
        char tekst;
        try{
            tekst=odczyt.next(".").charAt(0);
        }
        catch(InputMismatchException e){
            System.out.println("Podano zły typ danych");
        }
    }
}




