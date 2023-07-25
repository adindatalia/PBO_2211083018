/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA150423.Dao;
import java.util.List;
import DINDA150423.model.Peminjaman;
/**
 *
 * @author Administrator
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    void update (String index, Peminjaman peminjaman)throws Exception;
    void delete (String index) throws Exception;
    Peminjaman getPeminjaman(String kode) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
