/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.controller;

import UTSA.model.pelanggan;
import UTSA.model.pelangganDao;
import UTSA.view.FormPelanggan;

/**
 *
 * @author Administrator
 */
public class pelanggan {
    private FormPelanggan formPelanggan;
    private pelangganDao pelangganDao;
    private pelanggan pelanggan;
    
   public pelanggan (FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan;
        pelangganDao = new pelangganDaoImpl();
   }
}
