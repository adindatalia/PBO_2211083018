/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DINDA150423.model;

import java.util.List;

/**
 *
 * @author LEGION Y540
 */
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int index, Pengembalian pengembalian);
    void delete(int index);
    Pengembalian getPengembalian(int index);
    List<Pengembalian> getAll();
}
