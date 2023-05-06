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
public class BukuAlamat {
     public static void main(String[] args){
    
        EntryBukuAlamat data[] = new EntryBukuAlamat[100];
        EntryBukuAlamat temp = new EntryBukuAlamat();
        
        int menu = 0;
        int i = 0;
        while(menu != 88){
            menu = Integer.parseInt(JOptionPane.showInputDialog("Pilih Menu \n1.Insert\n2.Delete\n3.Display\n4.Update\n88.Exit"));
            switch(menu){
                case 1:
                   String nama = JOptionPane.showInputDialog("Masukkan Nama ");
                    String alamat = JOptionPane.showInputDialog("Masukkan Alamat ");
                    String telepon = JOptionPane.showInputDialog("Masukkan Telepon ");
                    String email = JOptionPane.showInputDialog("Masukkan Email ");
                    temp.setNama(nama);
                    temp.setAlamat(alamat);
                    temp.setTelepon(telepon);
                    temp.setEmail(email);
                    
                    data[i] = temp;
                    i++;
                    temp = new EntryBukuAlamat();
                    break; 
                case 2:
                    temp.setNama("");
                    temp.setAlamat("");
                    temp.setTelepon("");
                    temp.setEmail("");
                    
                    data[i-1] = temp;
                    i--;
                    temp = new EntryBukuAlamat();
                    JOptionPane.showMessageDialog(null, "Data terakhir dihapus");
                    break;
                case 3:
                    for(int j = 0; j < i; j++){
                        JOptionPane.showMessageDialog(null,"Data ke "+ j
                                + "\nNama   : " + data[j].getNama() 
                                + "\nAlamat : " + data[j].getAlamat() 
                                + "\nTelepon: " + data[j].getTelepon() 
                                + "\nEmail  : " + data[j].getEmail());
                    }break; 
                case 4:
                    nama = JOptionPane.showInputDialog("Masukkan Nama ");
                    alamat = JOptionPane.showInputDialog("Masukkan Alamat ");
                    telepon = JOptionPane.showInputDialog("Masukkan Telepon ");
                    email = JOptionPane.showInputDialog("Masukkan Email ");
                    temp.setNama(nama);
                    temp.setAlamat(alamat);
                    temp.setTelepon(telepon);
                    temp.setEmail(email);
                    
                    data[i-1] = temp;
                    temp = new EntryBukuAlamat();
                    break;
                default: break;
            }
        }
    }
}
