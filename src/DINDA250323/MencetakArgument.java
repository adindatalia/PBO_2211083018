/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA250323;

/**
 *
 * @author Administrator
 */
public class MencetakArgument {
    public static void main(String[] args){
    
        //rekomendasi dari netbeans
        /*for (String arg : args) {
            System.out.println(arg);   
        }*/
        
        for(int i = 0; i < args.length; i++){ //loop sampai panjang array
        System.out.println(args[i]); //output isi array sebanyak panjang array
        }
    }
}
