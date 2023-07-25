/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.controller;
import DINDA150423.view.FormAnggota;
import DINDA150423.model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import DINDA150423.Dao.*;
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
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(formAnggota.getTxtNobp().getText());
            anggota.setNamaanggota(formAnggota.getTxtNama().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggotaDao.insert(anggota);
            javax.swing.JOptionPane.showMessageDialog(formAnggota, "Entri Ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAnggota(){
        try {
            int index = formAnggota.getTblAnggota().getSelectedRow();
            anggota = anggotaDao.getAnggota("");
            if(anggota != null){
                formAnggota.getTxtNobp().setText(anggota.getKodeanggota());
                formAnggota.getTxtNama().setText(anggota.getNamaanggota());
                formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAnggota(){
        try {
            int index = formAnggota.getTblAnggota().getSelectedRow();
            anggota.setKodeanggota(formAnggota.getTxtNobp().getText());
            anggota.setNamaanggota(formAnggota.getTxtNama().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggotaDao.update("", anggota);
            javax.swing.JOptionPane.showMessageDialog(formAnggota,"Upadate ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAnggota(){
        try {
            int index = formAnggota.getTblAnggota().getSelectedRow();
            anggotaDao.delete("");
            javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete ok");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public void tampilData(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
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

   
    }

