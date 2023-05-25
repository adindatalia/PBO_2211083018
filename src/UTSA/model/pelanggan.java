/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.model;

/**
 *
 * @author Administrator
 */
public class pelanggan {
    private String KodePelanggan;
    private String NamaPelanggan;
    private String JenisPelanggan;
    
    public pelanggan(){
    }
    
    public pelanggan(String KodePelanggan,String NamaPelanggan,String JenisPelanggan){
        this.KodePelanggan = KodePelanggan;
        this.NamaPelanggan = NamaPelanggan;
        this.JenisPelanggan = JenisPelanggan;
    }
    
    public String getKodePelanggan(){
        return KodePelanggan;
    }
    
    public void setKodePelanggan(String KodePelanggan){
        this.KodePelanggan= KodePelanggan;
    }
    
    public String getNamaPelanggan(){
        return NamaPelanggan;
    }
    
    public void setNamaPelanggan(String NamaPelanggan){
        this.NamaPelanggan= NamaPelanggan;
    }
    
    public String JenisPelanggan(){
        return JenisPelanggan;
    }
    
    public void JenisPelanggan(String JenisPelanggan){
        this.JenisPelanggan= JenisPelanggan;
    }
}
