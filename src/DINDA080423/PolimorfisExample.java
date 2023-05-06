/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;

/**
 *
 * @author Administrator
 */
public class PolimorfisExample {
     public static void main(String[] args){
        //polimorfis merubah sesuai acuannya
        
        Person ref; //deklarasi class ref blm ada obj
        Student student = new Student(); //membuat obj
        Employee emp = new Employee(); //membuat obj employee
        student.setName("Budi");
        student.setAddress("Padang");
        emp.setName("Doni");
        emp.setAddress("Bukittinggi");
        
        printInformation(student);
        
        printInformation(emp);
        
//        ref = student; //ref menjadi student
//        String temp = ref.getName(); //ambil getname student
//        System.out.println(temp);

//        ref = emp; //ref menjadi employee
//        String temp1 = ref.getName(); //ambil getname dari employee
//        System.out.println(temp1);
    }
    
    public static void printInformation( Person p ){
        if(p instanceof Student){
            System.out.println("Nama Student   : " + p.getName());
            System.out.println("Alamat Student : " + p.getAddress());
        }else if(p instanceof Employee){
            System.out.println("Nama Employee   : " + p.getName());
            System.out.println("Alamat Employee : " + p.getAddress());  
        }
    }
}
