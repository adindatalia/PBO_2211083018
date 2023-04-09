/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA180323;

/**
 *
 * @author Administrator
 */
public class Latihan_Modul71_2 {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
        System.out.println("\nMenggunakan do-while-loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
    }
}
