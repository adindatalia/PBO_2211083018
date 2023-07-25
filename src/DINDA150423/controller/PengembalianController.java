/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.controller;

import java.util.*;
import javax.swing.table.DefaultTableModel;
import DINDA150423.model.*;
import DINDA150423.view.FormPengembalian;

/**
 *
 * @author LEGION Y540
 */
public class PengembalianController {
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    private PengembalianDao pengembalianDao;
    private Pengembalian pengembalian;
    private FormPengembalian formPengembalian;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formPengembalian.getTxtTglPinjam().setText("");
        formPengembalian.getTxtTglKembali().setText("");
        formPengembalian.getTxtTglDikembalikan().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        formPengembalian.getCboAnggota().removeAllItems();
        formPengembalian.getCboBuku().removeAllItems();
        
        for(Anggota anggota : listAnggota){
            formPengembalian.getCboAnggota().addItem(anggota.getNobp());
        }
    
        for(Buku buku : listBuku){
            formPengembalian.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        //pengembalian = new Pengembalian("",formPengembalian.getTxtTglKembali().getText());
        peminjaman.setAnggota(anggotaDao.getAnggota(formPengembalian.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPengembalian.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPengembalian.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        pengembalianDao.save(new Pengembalian("",formPengembalian.getTxtTglKembali().getText()));
        javax.swing.JOptionPane.showMessageDialog(formPengembalian, "Entri Ok");
    }
    
    public void savePengembalian(){
        int idx = formPengembalian.getTblPeminjaman().getSelectedRow();
        
        pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
        pengembalian.setSTerlambat(formPengembalian.getTxtTglKembali().getText());
        pengembalian.setSDenda();
        pengembalianDao.update(idx, pengembalian);
    }
    
    public void getPeminjaman(){
        int index = formPengembalian.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPinjam(index);
        pengembalian = pengembalianDao.getPengembalian(index);
        if(peminjaman != null){
            formPengembalian.getCboAnggota().setSelectedIndex(index);
            formPengembalian.getCboBuku().setSelectedIndex(index);
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglKembali().setText(peminjaman.getTglKembali());
            formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
        }
    }
    
    public void getPengembalian(){
        int index = formPengembalian.getTblDikembalikan().getSelectedRow();
        peminjaman = peminjamanDao.getPinjam(index);
        pengembalian = pengembalianDao.getPengembalian(index);
        if(peminjaman != null){
            formPengembalian.getCboAnggota().setSelectedIndex(index);
            formPengembalian.getCboBuku().setSelectedIndex(index);
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglKembali().setText(peminjaman.getTglKembali());
            formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
        }
    }
    
    public void updatePeminjaman(){
        int idx = formPengembalian.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPengembalian.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPengembalian.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPengembalian.getTxtTglKembali().getText());
        peminjamanDao.update(idx, peminjaman);
        
        pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
        pengembalian.setSTerlambat(formPengembalian.getTxtTglKembali().getText());
        pengembalian.setSDenda();
        pengembalianDao.update(idx, pengembalian);
    }
    
    public void deletePeminjaman(){
        int idx = formPengembalian.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(formPengembalian, "Delete Ok");
    }
    
    public void tampilDataPeminjaman(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTblPeminjaman().getModel();
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
    
    public void tampilDataPengembalian(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTblDikembalikan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pengembalian> list = pengembalianDao.getAll();
        java.util.List<Peminjaman> list1 = peminjamanDao.getAll();
        int i = 0;
        for(Pengembalian pengembalian : list){
            Object[] data = {
                peminjamanDao.getPinjam(i).getBuku().getKodeBuku(),
                pengembalian.getTglDikembalikan(),
                pengembalian.getSTerlambat(),
                pengembalian.getSDenda()
            };
            tabelModel.addRow(data);
            i++;
        }
    }
}
