/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
/**
 *
 * @author LEGION Y540
 */
public class Pengembalian {
    private String tglDikembalikan;
    private String sTerlambat;
    private String sDenda;
    
    private int terlambat;
    private double denda;
    
    public Pengembalian(){
    }
    
    public Pengembalian(String tglDikembalikan, String deadline){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.tglDikembalikan = tglDikembalikan;
        try{
            LocalDate dikembalikan = LocalDate.parse(tglDikembalikan,date);
            LocalDate tenggat = LocalDate.parse(deadline,date);
            if(dikembalikan.isAfter(tenggat)){
                terlambat = dikembalikan.compareTo(tenggat);
                sTerlambat = "" + terlambat;
            }
            else{
                terlambat = 0;
                sTerlambat = "0";
            }
            denda = terlambat * 500;
            sDenda = "" + denda;
        }catch( Exception e ){
            terlambat = -1;
            denda = -1;
            sTerlambat = "";
            sDenda = "";
        }
    }
    
    public String getTglDikembalikan(){
        return tglDikembalikan;
    }
    
    public void setTglDikembalikan(String tglDikembalikan){
        this.tglDikembalikan = tglDikembalikan;
    }
    
    public String getSTerlambat(){
        return sTerlambat;
    }
    
    public void setSTerlambat(String deadline){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            LocalDate dikembalikan = LocalDate.parse(tglDikembalikan,date);
            LocalDate tenggat = LocalDate.parse(deadline,date);
            if(dikembalikan.isAfter(tenggat)){
                terlambat = dikembalikan.compareTo(tenggat);
                sTerlambat = "" + terlambat;
            }
            else{
                terlambat = 0;
                sTerlambat = "0";
            }
        }catch( Exception e ){
            terlambat = -1;
            sTerlambat = "";
        }
    }
    
    public String getSDenda(){
        return sDenda;
    }
    
    public void setSDenda(){
        if(terlambat != -1){
            denda = terlambat * 500;
            sDenda = "" + denda;
        }
        else{
            denda = -1;
            sDenda = "";
        }
    }
    
}
