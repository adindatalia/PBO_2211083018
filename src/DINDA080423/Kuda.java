/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;

/**
 *
 * @author Administrator
 */
public class Kuda extends  LivingThing {
    
    @Override
    public void berjalan(){
        System.out.println("Berjalan Kuda");
    }
    
    public static void main(String[] args){
        Kuda k = new Kuda();
        k.bernafas();
        k.makan();
        k.berjalan();
    }
}
