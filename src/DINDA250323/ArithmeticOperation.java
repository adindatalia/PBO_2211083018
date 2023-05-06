/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA250323;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class ArithmeticOperation {
       public static void main(String[] args){
    
        int sum, diff, product, quotient; //deklarasi
        
        int a = Integer.parseInt(args[0]);  //mengubah tipe data string ke integer lalu diisi ke a
        int b = Integer.parseInt(args[1]); //mengubah tipe data string ke integer lalu diisi ke b
        
        sum = a + b; //proses penjumlahan
        diff = a - b; // proses pengurangan
        product = a * b; //proses perkalian
        quotient = a / b; //proses pembagian
         
        //output
        System.out.println("sum = " + sum);
        System.out.println("difference = " + diff);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}
