/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA010423;

/**
 *
 * @author Administrator
 */
public class StudentRecord {
    protected String name;
    private String address;
    private int age; 
    private double mathGrade; 
    private double englishGrade;
    private double scienceGrade;
    protected double average;
    private char huruf;
    
    private static int studentCount; //class variabel
    
    public String getName(){
        return name;
    }
    
    public void setName(String temp){
        name = temp;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String temp){
        address = temp;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
     public double getAverage(){
         average = (mathGrade+englishGrade+scienceGrade) / 3;
         return average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print( String temp ){
        System.out.println("Name:" + name);
        System.out.println("Address:" + address); 
        System.out.println("Age:" + age);  
    } 

    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade); 
        System.out.println("English Grade:" + eGrade); 
        System.out.println("Science Grade:" + sGrade);
    }
    
    public char getHuruf(){
        double average1 = average;
        if (average1 > 80 && average1 <= 100){
            huruf = 'A';
        }
        else if (average1 > 65 && average1 <= 80){
            huruf = 'B';
        }
        else if (average1 > 55 && average1 <= 65){
            huruf = 'C';
        }
        else if (average1 > 40 && average1 <= 55){
            huruf = 'D';
        }
        else{
            huruf = 'E';
        }
        return huruf;
    }
}            
