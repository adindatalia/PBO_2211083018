/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA.dao;

import DINDA.model.Buku;
import java.util.List;

/**
 *
 * @author Bagas
 */
public interface BukuDao {
    void insert(Buku buku) throws Exception;
    void update(Buku buku) throws Exception;
    void delete(Buku buku) throws Exception;
    Buku getBuku(String kode) throws Exception;
    List<Buku> getAll() throws Exception;
}
