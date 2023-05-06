/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA010423;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class StudentRecordMenu {
    public static void main(String[] args){
        StudentRecord data[] = new StudentRecord[100];
        StudentRecord temp = new StudentRecord();
        
        int menu = 0;
        int i = 0;
        while(menu != 88){
            menu = Integer.parseInt(JOptionPane.showInputDialog("Pilih Menu \n1.Insert Data\n2.Delete Data\n3.Display Data\n4.Update Data\n88.Exit"));
            switch(menu){
                case 1: //insert data
                    String nama = JOptionPane.showInputDialog("Masukkan Nama ");
                    int math = Integer.parseInt(JOptionPane.showInputDialog("Masukkan MathGrade "));
                    int english = Integer.parseInt(JOptionPane.showInputDialog("Masukkan EnglishGrade "));
                    int science = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ScienceGrade "));
                    temp.setName(nama);
                    temp.setMathGrade(math);
                    temp.setEnglishGrade(english);
                    temp.setScienceGrade(science);
                    
                    data[i] = temp;
                    i++;
                    temp = new StudentRecord();
                    break; 
                    
                case 2: //delete data
                    temp.setName("");
                    temp.setMathGrade(0);
                    temp.setEnglishGrade(0);
                    temp.setScienceGrade(0);
                    
                    data[i-1] = temp;
                    i--;
                    temp = new StudentRecord();
                    JOptionPane.showMessageDialog(null, "Data terakhir dihapus");
                    break;
                    
                case 3: //display // akan menampilkan semua data seperti rata-rata dan grade huruf
                    for(int j = 0; j < i; j++){
                        JOptionPane.showMessageDialog(null,"Data ke "+ j
                                + "\nNama        : " + data[j].getName() 
                                + "\nMathGrade   : " + data[j].getMathGrade() 
                                + "\nEnglishGrade: " + data[j].getEnglishGrade() 
                                + "\nScienceGrade: " + data[j].getScienceGrade()
                                + "\nRata-rata   : " + data[j].getAverage()
                                + "\nGrade       : " + data[j].getHuruf());
                    }break;
                    
                case 4: //edit data
                    nama = JOptionPane.showInputDialog("Masukkan Nama ");
                    math = Integer.parseInt(JOptionPane.showInputDialog("Masukkan mathGrade "));
                    english = Integer.parseInt(JOptionPane.showInputDialog("Masukkan englishGrade "));
                    science = Integer.parseInt(JOptionPane.showInputDialog("Masukkan scienceGrade "));
                    temp.setName(nama);
                    temp.setMathGrade(math);
                    temp.setEnglishGrade(english);
                    temp.setScienceGrade(science);
                    
                    
                    data[i-1] = temp;
                    temp = new StudentRecord();
                    break;
                    
                default: break;
            }
        }
    }
}
