/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


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
        this.Kodektp=kode;
        this.tanggal=Tanggal;
        this.NamaPemilik=pemilik;
        this.NamaPengambil=pengambil;
        this.kelurahan=kel;
        this.keterangan=ket;
                
          
    
}
    public void setKodektp(int kode){
        this.Kodektp=kode;
    }

    public int getKodektp(){
        return this.Kodektp;
    }
    
    public void setTanggal(int Tanggal){
        this.tanggal=Tanggal;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNamaPemilik(String pemilik){
        this.NamaPemilik=pemilik;
    }
    
    public String getNamaPemilik(){
        return this.NamaPemilik;
    }
    
    public void setNamaPengambil(String pengambil){
        this.NamaPengambil=pengambil;
    }
    
    public String getNamaPengambil(){
        return this.NamaPengambil;
    }
    
    public void setKelurahan(String kel){
        this.kelurahan=kel;
    }
    
    public String getKelurahan(){
        return this.kelurahan;
    }
    
    public void setKeterangan(String ket){
        this.keterangan=ket;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
     public void tampilkanDataPengambilanKTP() {
        System.out.println("Kode : " + Kodektp);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Nama Pemilik : " + NamaPemilik);
        System.out.println("Nama Pengambil : " + NamaPengambil);
        System.out.println("Kelurahan : " + kelurahan);
        System.out.println("Keterangan : " + keterangan);
    }
}


