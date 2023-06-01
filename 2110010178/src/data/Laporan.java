/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Rudia
 */
public class Laporan {
    private int No;
    private int tanggal;
    private String namaPengambil;
    private String Jenis_Pengambilan;
    private int Kode;
    private String Status;
    
    public Laporan(){}
    
    public Laporan(int no, int tgl, String pengambil, String jenis, int kode, String status){
        this.No= no;
        this.tanggal=tgl;
        this.namaPengambil=pengambil;
        this.Jenis_Pengambilan=jenis;
        this.Kode=kode;
        this.Status=status;
    }
    
    public void setNo(int no){
        this.No=no;
    }
    
    public int getNo(){
        return this.No;
    }
    
     public void setTanggal(int tgl){
        this.tanggal=tgl;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNamapengambil(String pengambil){
        this.namaPengambil=pengambil;
    }
    
    public String getNamapengambil(){
        return this.namaPengambil;
    }
    public void setJenis_pengambil(String jenis){
        this.Jenis_Pengambilan=jenis;
    }
    
    public String getJenis_pengambil(){
        return this.Jenis_Pengambilan;
    }
    
    public void setKode(int kode){
        this.Kode=kode;
    }
    
    public int getKode(){
        return this.Kode;
    }
    
    public void setStatus(String status){
        this.Status=status;
    }
    
    public String getStatus(){
        return this.Status;
    }
    
    public void tampilkanLaporan() {
        System.out.println("No : " + No);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Nama Pengambil: " + namaPengambil);
        System.out.println("Jenis Pengambilan: " + Jenis_Pengambilan);
        System.out.println("Kode : " + Kode);
        System.out.println("Status : " + Status);
    }
}
