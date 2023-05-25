/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class pelangganDaoImpl implements pelangganDao{
    List<pelanggan> data;
    public pelangganDaoImpl(){ 
        data = new ArrayList<>();
        data.add(new pelanggan("1111","Adinda","Padang"));
        data.add(new pelanggan("2222","Della","Padang"));
        data.add(new pelanggan("3333","Amanda","Padang"));   
    }
    
    public void save (pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index, pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete (int index){
        data.remove(index);
    }
    public pelanggan getAnggota(int index){
        return data.get(index);
    }
    public List<pelanggan> getAll(){
    return data;
}

    @Override
    public pelanggan getpelanggan(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
