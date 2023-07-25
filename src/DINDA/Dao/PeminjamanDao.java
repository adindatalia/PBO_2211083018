/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA.dao;

import DINDA.model.Peminjaman;
import java.util.List;
/**
 *
 * @author Bagas
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws Exception;
    void update(Peminjaman peminjaman) throws Exception;
    void delete(Peminjaman peminjaman) throws Exception;
    Peminjaman getPeminjaman(String kodeAnggota,String kodeBuku, String tglPinjam) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
