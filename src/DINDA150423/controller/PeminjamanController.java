/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.controller;

import DINDA150423.model.*;
import DINDA150423.view.FormPeminjaman;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LEGION Y540
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    private FormPeminjaman formPeminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
        
        for(Anggota anggota : listAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
        }
    
        for(Buku buku : listBuku){
            formPeminjaman.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPinjam(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getKodeBuku());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(idx, peminjaman);
    }
    
    public void deletePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getAnggota().getNama(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}
