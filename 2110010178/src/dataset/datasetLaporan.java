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
public class datasetLaporan {
    private ArrayList<Integer> No;
    private ArrayList<String> tanggal;
    private ArrayList<String> namaPengambil;
    private ArrayList<String> Jenis_Pengambilan;
    private ArrayList<Integer> Kode;
    private ArrayList<String> Status;
    
    public datasetLaporan(){
        No = new ArrayList<Integer>();
        tanggal= new ArrayList<String>();
        namaPengambil= new ArrayList<String>();
        Jenis_Pengambilan = new ArrayList<String>();
        Kode= new ArrayList<Integer>();
        Status= new ArrayList<String>();
    }
    
    public void insertNO(int no){
        this.No.add(no);
    }
    
    public ArrayList<Integer> getRecordNO(){
        return this.No;
    }
    
    public void insertTanggal(String tgl){
        this.tanggal.add(tgl);
    }
    
    public ArrayList<String> getRecordTanggal(){
        return this.tanggal;
    }
    
    public void insertNama(String nama){
        this.namaPengambil.add(nama);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.namaPengambil;
    }
    
    public void insertJenis(String jenis){
        this.Jenis_Pengambilan.add(jenis);
    }
    
    public ArrayList<String> getRecordJenis(){
        return this.Jenis_Pengambilan;
    }
    
    public void insertKode(int kode){
        this.Kode.add(kode);
    }
    
    public ArrayList<Integer> getRecordKode(){
        return this.Kode;
    }
    public void insertStatus(String status){
        this.Status.add(status);
    }
    
    public ArrayList<String> getRecordStatus(){
        return this.Status;
    }
    
}
