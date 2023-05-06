/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;

/**
 *
 * @author Administrator
 */
public abstract class Shape {
    
    public abstract double getArea();
    public abstract String getName();
    
    public static void main(String[] args){
        Circle c = new Circle(10);
        Square s = new Square(20);
        System.out.println("Nama obj c : " + c.getName());
        System.out.println("Luas Obj c : " + c.getArea());
        System.out.println("Nama Obj s : " + s.getName());
        System.out.println("Luas Obj s : " + s.getArea());
    }
}
