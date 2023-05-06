/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;

/**
 *
 * @author Administrator
 */
public class Person {
//jika menambah class final(ex public final class) berarti tidak bisa diturunkan atau extends
    protected String name;
    protected String address;
    
    public Person(){
        System.out.println("Inside Person:Constructor");
    }
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //overriding method
    public String getName(){ //akan error di method student jika getName diperson diberi final(ex public final String)
        System.out.println("Person:getName");
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
}
