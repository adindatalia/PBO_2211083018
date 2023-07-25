/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LEGION Y540
 */
public class BukuDaoImpl implements BukuDao {
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("0001","Hello","Stall","man","1991"));
        data.add(new Buku("0002","Last","Rick","Tie","1986"));
        data.add(new Buku("0003","Time","Fred","kick","1990"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
