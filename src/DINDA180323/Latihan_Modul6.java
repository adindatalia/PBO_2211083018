/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA180323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Administrator
 */
public class Latihan_Modul6 {
    public static void main (String [] args) throws IOException{
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println( "Masukan nilai ujian ke - 1:");
        double nilai1 = Double.parseDouble(reader.readLine());
        
        System.out.println( "Masukan nilai ujian ke - 2:");
        double nilai2 = Double.parseDouble(reader.readLine());
   
        System.out.println( "Masukan nilai ujian ke - 3:");
        double nilai3 = Double.parseDouble(reader.readLine());
        
       double rataRata = (nilai1 + nilai2 + nilai3)/3;
       System.out.println("rata- rata nilai ujian adalah:" + rataRata);
       
       if (rataRata >= 60){
           System.out.println( ":)");
       } else {
           System.out.println(":)");
       }
    }  
}
