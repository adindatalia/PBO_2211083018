/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA.controller;
import DINDA.view.FormAnggota;
import DINDA.model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import DINDA.Dao.*;
/**
 *
 * @author Administrator
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController (FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(formAnggota.getTxtKodeAnggota().getText());
            anggota.setNamaanggota(formAnggota.getTxtNamaAnggota().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggotaDao.insert(anggota);
            javax.swing.JOptionPane.showMessageDialog(formAnggota, "Entri Ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAnggota(){
        try {
            anggota = anggotaDao.getAnggota("");
            if(anggota != null){
                formAnggota.getTxtKodeAnggota().setText(anggota.getKodeanggota());
                formAnggota.getTxtNamaAnggota().setText(anggota.getNamaanggota());
                formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAnggota(){
        try {
            anggota.setKodeanggota(formAnggota.getTxtKodeAnggota().getText());
            anggota.setNamaanggota(formAnggota.getTxtNamaAnggota().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggotaDao.update("", anggota);
            javax.swing.JOptionPane.showMessageDialog(formAnggota,"Upadate ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAnggota(){
        try {
            anggotaDao.delete("");
            javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public void tampilData(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota();
            tabelModel.setRowCount(0);
            java.util.List<Anggota> list = anggotaDao.getAll();
            for(Anggota anggota : list){
                Object[] data = {
                    anggota.getKodeanggota(),
                    anggota.getNamaanggota(),
                    anggota.getAlamat()
                };
                tabelModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tabelAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void TblAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }

