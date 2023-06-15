/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Rudia
 */
public class datasetRegistrasiKK {
    private ArrayList<Integer> KodeKK;
    private ArrayList<String> Tanggal;
    private ArrayList<String> Nama;
    private ArrayList<String> Jenis_Permohonan;
    private ArrayList<String> Kelurahan;
    private ArrayList<String> Alamat;
    private ArrayList<String> Rt;
    private ArrayList<String> Rw;
    private ArrayList<String> Keterangan;
    
    public datasetRegistrasiKK(){
        KodeKK = new ArrayList<Integer>();
        Tanggal = new ArrayList<String>();
        Nama = new ArrayList<String>();
        Jenis_Permohonan = new ArrayList<String>();
        Kelurahan = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        Rt = new ArrayList<String>();
        Rw = new ArrayList<String>();
        Keterangan = new ArrayList<String>();
        
    }
    
    public void insertKodekk(int kode){
        this.KodeKK.add(kode);
    }
    
    public ArrayList<Integer> getRecordKodekk(){
        return this.KodeKK;
    }
    
    public void insertTanggal(String tgl){
        this.Tanggal.add(tgl);
    }
    
    public ArrayList<String> getRecordTanggal(){
        return this.Tanggal;
    }
    
    public void insertNama(String nama){
        this.Nama.add(nama);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertjenis(String jenis){
        this.Jenis_Permohonan.add(jenis);
    }
    
    public ArrayList<String> getRecordjenis(){
        return this.Jenis_Permohonan;
    }
     
    public void insertKelurahan(String kel){
        this.Kelurahan.add(kel);
    }
    
    public ArrayList<String> getRecordKelurahan(){
        return this.Kelurahan;
    }
     
    public void insertalamat(String alamat){
        this.Alamat.add(alamat);
    }
    
    public ArrayList<String> getRecordalamat(){
        return this.Alamat;
    }
    public void insertRT(String rt){
        this.Rt.add(rt);
    }
    
    public ArrayList<String> getRecordRT(){
        return this.Rt;
    }
     
    public void insertRW(String rw){
        this.Rw.add(rw);
    }
    
    public ArrayList<String> getRecordRW(){
        return this.Rw;
    }
     
    public void insertKeterangan(String ket){
        this.Keterangan.add(ket);
    }
    
    public ArrayList<String> getRecordKeterangan(){
        return this.Keterangan;
    }
}
