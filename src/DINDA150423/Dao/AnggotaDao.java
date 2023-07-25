/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA150423.Dao;
import java.util.List;
import DINDA150423.model.Anggota;
/**
 *
 * @author Administrator
 */
public interface AnggotaDao {
    
   void insert (Anggota anggota) throws Exception;
    void update (String index, Anggota anggota)throws Exception;
    void delete (String index) throws Exception;
    Anggota getAnggota(String kode) throws Exception;
    List<Anggota> getAll() throws Exception;
}
