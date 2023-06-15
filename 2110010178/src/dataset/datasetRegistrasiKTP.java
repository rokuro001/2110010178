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
public class datasetRegistrasiKTP {
    private ArrayList<Integer> kodeKtp;
    private ArrayList<String> Tanggal;
    private ArrayList<String> Nama;
    private ArrayList<String> Jenis_Permohonan;
    private ArrayList<String> Kelurahan;
    private ArrayList<String> Alamat;
    private ArrayList<String> Rt;
    private ArrayList<String> Rw;
    private ArrayList<String> Jk;
    private ArrayList<String> Agama;
    private ArrayList<String> Pekerjaan;
    private ArrayList<String> Kw;
    
    public datasetRegistrasiKTP(){
        kodeKtp = new ArrayList<Integer>();
        Tanggal = new ArrayList<String>();
        Nama = new ArrayList<String>();
        Jenis_Permohonan = new ArrayList<String>();
        Kelurahan = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        Rt = new ArrayList<String>();
        Rw = new ArrayList<String>();
        Jk = new ArrayList<String>();
        Agama = new ArrayList<String>();
        Pekerjaan = new ArrayList<String>();
        Kw = new ArrayList<String>();
    }
    
     public void insertKodektp(int kode){
        this.kodeKtp.add(kode);
    }
    
    public ArrayList<Integer> getRecordKodektp(){
        return this.kodeKtp;
    }
    
     public void inserttanggal(String tgl){
        this.Tanggal.add(tgl);
    }
    
    public ArrayList<String> getRecordtanggal(){
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
    
     public void insertkelurahan(String kel){
        this.Kelurahan.add(kel);
    }
    
    public ArrayList<String> getRecordkelurahan(){
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
    
     public void insertjenis_kelamin(String jk){
        this.Jk.add(jk);
    }
    
    public ArrayList<String> getRecordjenis_kelamin(){
        return this.Jk;
    }
    
     public void insertagama(String agama){
        this.Agama.add(agama);
    }
    
    public ArrayList<String> getRecordagama(){
        return this.Agama;
    }
    
     public void insertpekerjaan(String pekerjaan){
        this.Pekerjaan.add(pekerjaan);
    }
    
    public ArrayList<String> getRecordpekerjaan(){
        return this.Pekerjaan;
    }
    
     public void insertKwarganegaraan(String kw){
        this.Kw.add(kw);
    }
    
    public ArrayList<String> getRecordKwarganegaraan(){
        return this.Kw;
    }
    
}
