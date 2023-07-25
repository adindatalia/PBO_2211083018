/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA.dao;

import DINDA.model.Pengembalian;
import java.util.List;

/**
 *
 * @author Bagas
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws Exception;
    void update(Pengembalian pengembalian) throws Exception;
    void delete(Pengembalian pengembalian) throws Exception;
    Pengembalian getPengembalian(String kodeAnggota,String kodeBuku, String tglPinjam, String tglDikembalikan) throws Exception;
    List<Pengembalian> getAll() throws Exception;
    List<Pengembalian> getAll(String kategori, String cari) throws Exception;
    int selisihTanggal(String tgl1, String tgl2) throws Exception;

    public List<Pengembalian> cari(String kode, String cari);

    public void Insert(Pengembalian pg);

    public void Delete(Pengembalian pg);

    public int terlmbat(String tglDikembalikan, String tanggalkembali);

    public void Update(Pengembalian pg);
}
