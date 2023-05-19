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
public class PengambilanKtp {
    private int Kodektp;
    private int tanggal;
    private String NamaPemilik;
    private String NamaPengambil;
    private String kelurahan;
    private String keterangan;

public PengambilanKtp(){}

public PengambilanKtp(int kode, int Tanggal, String pemilik, String pengambil, String kel, String ket){
    setKodektp(Kodektp);
    setTanggal(tanggal);
    setNamaPemilik(NamaPemilik);
    setNamaPengambil(NamaPengambil);
    setKelurahan(kelurahan);
    setKeterangan(keterangan);
    
}
    public void setKodektp(int kode){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan kode KTP : ");
        kode = objku.nextInt();
        this.Kodektp=kode;
    }

    public int getKodektp(){
        return this.Kodektp;
    }
    
    public void setTanggal(int Tanggal){
        Scanner objku = new Scanner (System.in);
        System.out.println("Masukkan Tanggal : ");
        Tanggal = objku.nextInt();
        this.tanggal=Tanggal;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNamaPemilik(String pemilik){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan nama pemilik : ");
        pemilik = objku.nextLine();
        this.NamaPemilik=pemilik;
    }
    
    public String getNamaPemilik(){
        return this.NamaPemilik;
    }
    
    public void setNamaPengambil(String pengambil){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan nama pengambil : ");
        pengambil = objku.nextLine();
        this.NamaPengambil=pengambil;
    }
    
    public String getNamaPengambil(){
        return this.NamaPengambil;
    }
    
    public void setKelurahan(String kel){
        Scanner objku = new Scanner(System.in);
        System.out.println("Kelurahan : ");
        kel = objku.nextLine();
        this.kelurahan=kel;
    }
    
    public String getKelurahan(){
        return this.kelurahan;
    }
    
    public void setKeterangan(String ket){
        Scanner objku = new Scanner(System.in);
        System.out.println("Keterangan : ");
        ket = objku.nextLine();
        this.keterangan=ket;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
     public void tampilkanDataPengambilanKTP() {
        System.out.println("Kode : " + getKodektp());
        System.out.println("Tanggal: " + getTanggal());
        System.out.println("Nama Pemilik : " + getNamaPemilik());
        System.out.println("Nama Pengambil : " + getNamaPengambil());
        System.out.println("Kelurahan : " + getKelurahan());
        System.out.println("Keterangan : " + getKeterangan());
    }
}


