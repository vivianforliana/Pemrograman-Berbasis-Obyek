/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan.sistemlogic;

/**
 *
 * @author A-25
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;       
    private Mahasiswa[] dataMahasiswas;
    private Staf[] dataStafs;

    public SistemPerkuliahan() {
    }

    public SistemPerkuliahan(Perkuliahan[] dataPerkuliahans, Dosen[] dataDosens, Mahasiswa[] dataMahasiswas, Staf[] dataStafs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasiswas = dataMahasiswas;
        this.dataStafs = dataStafs;
    }
    
    
    
    
}
