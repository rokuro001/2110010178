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
public class datasetPengambilanKTP {
    private ArrayList<Integer> Kodektp;
    private ArrayList<String> tanggal;
    private ArrayList<String> NamaPemilik;
    private ArrayList<String> NamaPengambil;
    private ArrayList<String> kelurahan;
    private ArrayList<String> keterangan;
    
    public datasetPengambilanKTP(){
        Kodektp = new ArrayList<Integer>();
        tanggal = new ArrayList<String>();
        NamaPemilik = new ArrayList<String>();
        NamaPengambil = new ArrayList<String>();
        kelurahan = new ArrayList<String>();
        keterangan = new ArrayList<String>();
    }

    public void insertKodektp(int kode){
        this.Kodektp.add(kode);
    }
    
    public ArrayList<Integer> getRecordKodektp(){
        return this.Kodektp;
    }
    
     public void insertTanggal(String tgl){
        this.tanggal.add(tgl);
    }
    
    public ArrayList<String> getRecordTanggal(){
        return this.tanggal;
    }
      
    public void insertNamaPemilik(String namapemilik){
        this.NamaPemilik.add(namapemilik);
    }
    
    public ArrayList<String> getRecordNamaPemilik(){
        return this.NamaPemilik;
    }
    
    public void insertNamapengambil(String pengambil){
        this.NamaPengambil.add(pengambil);
    }
    
    public ArrayList<String> getRecordNamapengambil(){
        return this.NamaPengambil;
    }
    
    public void insertKelurahan(String kel){
        this.kelurahan.add(kel);
    }
    
    public ArrayList<String> getRecordKelurahan(){
        return this.kelurahan;
    }
    
    public void insertKeterangan(String ket){
        this.keterangan.add(ket);
    }
    
    public ArrayList<String> getRecordKeterangan(){
        return this.keterangan;
    }
}
