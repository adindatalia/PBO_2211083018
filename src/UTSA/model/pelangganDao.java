/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.model;
import java.util.List;
/**
 *
 * @author Administrator
 */
public interface pelangganDao {
    
    void save(pelanggan pelanggan);
    void update(int index, pelanggan pelanggan);
    void delete (int index);
    pelanggan getpelanggan(int index);
    List <pelanggan> getAll();

}
