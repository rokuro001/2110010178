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
public class datasetPengambilanKK {
    private ArrayList<Integer> KodeKK;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> noKK;
    private ArrayList<String> NamaKepalaKK;
    private ArrayList<String> NamaPengambil;
    private ArrayList<String> Kelurahan;
    private ArrayList<String> Alamat;
    private ArrayList<String> keterangan;
    
    public  datasetPengambilanKK(){
        KodeKK = new ArrayList<Integer>();
        tanggal = new ArrayList<String>();
        noKK = new ArrayList<Integer>();
        NamaKepalaKK = new ArrayList<String>();
        NamaPengambil = new ArrayList<String>();
        Kelurahan = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        keterangan = new ArrayList<String>();
    }
    
    public void insertKodekk(int kode){
        this.KodeKK.add(kode);
    }
    
    public ArrayList<Integer> getRecordKodekk(){
        return this.KodeKK;
    }
    
    public void insertTanggal(String tgl){
        this.tanggal.add(tgl);
    }
    
    public ArrayList<String> getRecordTanggal(){
        return this.tanggal;
    }
    
    public void insertNokk(int no){
        this.noKK.add(no);
    }
    
    public ArrayList<Integer> getRecordNokk(){
        return this.noKK;
    }
    
    public void insertNamaKepalakk(String namakepala){
        this.NamaKepalaKK.add(namakepala);
    }
    
    public ArrayList<String> getRecordNamaKepalakk(){
        return this.NamaKepalaKK;
    }
    
    public void insertNamapengambil(String pengambil){
        this.NamaPengambil.add(pengambil);
    }
    
    public ArrayList<String> getRecordNamapengambil(){
        return this.NamaPengambil;
    }
    
    public void insertKelurahan(String kel){
        this.Kelurahan.add(kel);
    }
    
    public ArrayList<String> getRecordKelurahan(){
        return this.Kelurahan;
    }
    
    public void insertAlamat(String alamat){
        this.Alamat.add(alamat);
    }
    
    public ArrayList<String> getRecordAlamat(){
        return this.Alamat;
    }
    
    public void insertKeterangan(String ket){
        this.keterangan.add(ket);
    }
    
    public ArrayList<String> getRecordKeterangan(){
        return this.keterangan;
    }
}
