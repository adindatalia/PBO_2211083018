/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Bagas
 */
public class Pengembalian {
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;

    public Pengembalian(){}

    public Pengembalian(String kodeAnggota, String kodeBuku, String tglPinjam, String tglDikembalikan) {
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglDikembalikan = tglDikembalikan;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public void setTerlambat(String tglKembali) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate deadline = LocalDate.parse(tglKembali, formatter);
            LocalDate dikembalikan = LocalDate.parse(this.tglDikembalikan, formatter);

            terlambat = 0;
            if (dikembalikan.isAfter(deadline)) {
                terlambat = (int) ChronoUnit.DAYS.between(deadline, dikembalikan);
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            tglDikembalikan = "Belum dikembalikan";
            terlambat = 0;
        }
    }

    public void setDenda() {
        this.denda = terlambat * 2000;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public double getDenda() {
        return denda;
    } 

    public Object getNamaAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getJudul() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTglpPjm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTglkmbl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getKodeAgg() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setKodeAgg(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTglpPjm(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDenda(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTerlambat(int terlambat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
