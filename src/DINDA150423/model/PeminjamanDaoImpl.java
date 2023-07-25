/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.model;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author LEGION Y540
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
    List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        AnggotaDao anggotaDao = new AnggotaDaoImpl();
        BukuDao bukuDao = new BukuDaoImpl();
        data.add(new Peminjaman(anggotaDao.getAnggota(0),bukuDao.getBuku(0),"01/01/2023","10/01/2023"));
    }
    
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index, Peminjaman peminjaman){
         data.set(index, peminjaman);
    }
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPinjam(int index){
        return data.get(index);
    }
    public List<Peminjaman> getAll(){
        return data;
    }
}
