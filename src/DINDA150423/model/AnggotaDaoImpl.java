/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DINDA150423.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class AnggotaDaoImpl implements AnggotaDao{
    List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){ //constructor inisialisasi data
        data.add(new Anggota("1111","Adinda","Padang"));
        data.add(new Anggota("2222","Della","Padang"));
        data.add(new Anggota("3333","Amanda","Padang"));   
    }
    
    public void save (Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAll(){
    return data;
}
    
}
