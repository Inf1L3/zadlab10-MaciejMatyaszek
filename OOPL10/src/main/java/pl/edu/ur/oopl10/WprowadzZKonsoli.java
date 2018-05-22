/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        public void ToFileText() throws IOException {
        String nazwa;
        System.out.println("Podaj nazwę pliku: ");
        nazwa = odczyt.nextLine();

        try {
            FileWriter fwo = new FileWriter(nazwa);
           BufferedWriter bwo = new BufferedWriter(fwo);
           String tekst;
           System.out.println("Wpisz tekst do pliku: ");
            tekst = odczyt.nextLine();
            bwo.write(tekst);
           bwo.newLine();
           bwo.close();

        } catch (IOException e) {
            System.out.println("Błąd");
         }

     }
    
    
    public void FromFileText() throws FileNotFoundException, IOException {
        String nazwa;
        System.out.println("Podaj nazwe pliku z ktorego chcesz odczytac tekst");
        nazwa = odczyt.nextLine();
        try {
            FileReader fr = new FileReader(nazwa);
            BufferedReader br = new BufferedReader(fr);

            String tekst = br.readLine();
            System.out.println(""+tekst);
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie został odnaleziony");
        }

    }
 
}




