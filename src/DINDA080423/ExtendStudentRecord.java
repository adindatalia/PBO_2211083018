/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA080423;
import DINDA010423.StudentRecord;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class ExtendStudentRecord extends StudentRecord{
     private double excelGrade;
    private double pptGrade;
    private double wordGrade;
    
    //membuat method untuk nilai computer
    public double getExcelGrade(){
        return excelGrade;
    }
    
    public void setExcelGrade(double excelGrade){
        this.excelGrade = excelGrade;
    }
    
    public double getPptGrade(){
        return pptGrade;
    }
    
    public void setPptGrade(double pptGrade){
        this.pptGrade = pptGrade;
    }
    
    public double getWordGrade(){
        return wordGrade;
    }
    
    public void setWordGrade(double wordGrade){
        this.wordGrade = wordGrade;
    }
    
    //overriding method
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public double getAverage(){
        average = (excelGrade + pptGrade + wordGrade) / 3;
        return average;
    }
    
    //membuat method main agar program dapat berjalan
    public static void main(String[] args){
        //membuat obj c dengan class ExtendStudentRecord
        ExtendStudentRecord c = new ExtendStudentRecord();
        
        //input nama
        String nama = JOptionPane.showInputDialog("Masukkan nama");
        c.setName(nama);
        
        //input nilai
        int excel = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai Excel"));
        c.setExcelGrade(excel);
        int ppt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai PowerPoint"));
        c.setPptGrade(ppt);
        int word = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai Word"));
        c.setWordGrade(word);
        
        //output
        JOptionPane.showMessageDialog(null,"=====Computer Grade=====" + "\nNama : " + c.getName() 
                + "\nNilai Excel      : " + c.getExcelGrade()
                + "\nNilai PowerPoint : " + c.getPptGrade()
                + "\nNilai Word       : " + c.getWordGrade()
                + "\nRata-rata        : " + c.getAverage());
    }
}
