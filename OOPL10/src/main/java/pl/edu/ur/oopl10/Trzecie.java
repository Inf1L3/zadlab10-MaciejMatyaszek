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
public class Trzecie {
    public void DzieleniePrzezZero(int dzielna, int dzielnik){
        try{
            int wynik=dzielna/dzielnik;
            System.out.println("Wynik dzielnia " +dzielna+" przez " +dzielnik+" to "+wynik);
        }
        catch(java.lang.Exception e)
    {
      System.out.println("Nie mozna dzielić przez 0 "  );
    }
    }
    public static void main(String[] args) {    
    Trzecie s1=new Trzecie();
    for(int i=0;i<10;i++)
     {
     for(int j=0;j<10;j++)
     {
     s1.DzieleniePrzezZero(i, j);
     }
     }}}
    
