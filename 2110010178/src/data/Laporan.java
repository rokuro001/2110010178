/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.Scanner;

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
        setNo(No);
        setTanggal(tanggal);
        setNamapengambil(namaPengambil);
        setJenis_pengambil(Jenis_Pengambilan);
        setKode(Kode);
        setStatus(Status);
    }
    
    public void setNo(int no){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan No :");
        no = objku.nextInt();
        this.No=no;
    }
    
    public int getNo(){
        return this.No;
    }
    
     public void setTanggal(int tgl){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan Tanggal : ");
        tgl = objku.nextInt();
        this.tanggal=tgl;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNamapengambil(String pengambil){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan Nama Pengambil : ");
        pengambil = objku.nextLine();
        this.namaPengambil=pengambil;
    }
    
    public String getNamapengambil(){
        return this.namaPengambil;
    }
    public void setJenis_pengambil(String jenis){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan Jenis Pengambilan : ");
        jenis = objku.nextLine();
        this.Jenis_Pengambilan=jenis;
    }
    
    public String getJenis_pengambil(){
        return this.Jenis_Pengambilan;
    }
    
    public void setKode(int kode){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan Kode : ");
        kode = objku.nextInt();
        this.Kode=kode;
    }
    
    public int getKode(){
        return this.Kode;
    }
    
    public void setStatus(String status){
        Scanner objku= new Scanner(System.in);
        System.out.println("Masukkan Status : ");
        status = objku.nextLine();
        this.Status=status;
    }
    
    public String getStatus(){
        return this.Status;
    }
    
    public void tampilkanLaporan() {
        System.out.println("No : " + getNo());
        System.out.println("Tanggal : " + getTanggal());
        System.out.println("Nama Pengambil: " + getNamapengambil());
        System.out.println("Jenis Pengambilan: " + getJenis_pengambil());
        System.out.println("Kode : " + getKode());
        System.out.println("Status : " + getStatus());
    }
}
