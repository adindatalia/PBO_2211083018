/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;

/**
 *
 * @author Administrator
 */
public class Student extends Person{
    
    public Student(){
        super("Ali","Padang"); //memanggil super class
        System.out.println("Inside Student:Constructor");
    }
    
    @Override //menandakan di superclass ada getName juga
    public String getName(){
        System.out.println("Student getName");
        return name;
    }
    
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Nama   : " + student.name );
        System.out.println("Alamat : " + student.address );
    }
    
}
