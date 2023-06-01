/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Rudia
 */
public class RegistrasiKK {
    private int KodeKK;
    private int Tanggal;
    private String Nama;
    private String Kelurahan;
    private String Alamat;
    private String Rt;
    private String Rw;
    private String Keterangan;
    
    public RegistrasiKK(){}
    
    public RegistrasiKK(int kode, int tanggal, String nama, String kel, String alamat, String rt, String rw, String ket){
        this.KodeKK=kode;
        this.Tanggal=tanggal;
        this.Nama=nama;
        this.Kelurahan=kel;
        this.Alamat=alamat;
        this.Rt=rt;
        this.Rw=rw;
        this.Keterangan=ket;
    }
    
    public void setkodekk(int kode){
    this.KodeKK=kode;
}

public int getkodekk(){
    return this.KodeKK;
}

public void settanggal(int tanggal){
    this.Tanggal=tanggal;
    }
    
    public int gettanggal(){
    return this.Tanggal;
    }
    
    public void setnama(String nama){
    this.Nama=nama;
    }
    
    public String getnama(){
    return this.Nama;
    }
    
    public void setkelurahan(String kel){
    this.Kelurahan=kel;
    }
    
    public String getkelurahan(){
    return this.Kelurahan;
    }
    
    public void setalamat(String alamat){
    this.Alamat=alamat;
    }
    
    public String getalamat(){
    return this.Alamat;
    }
    
    public void setrt(String rt){
    this.Rt=rt;
    }
    
    public String getrt(){
    return this.Rt;
    }
    
    public void setrw(String rw){
    this.Rw=rw;
    }
    
    public String getrw(){
    return this.Rw;
    }
    
    public void setketerangan(String ket){
    this.Keterangan=ket;
    }
    
    public String getketerangan(){
    return this.Keterangan;
    }
    
    public void tampilkanDataRegistrasiKK() {
    System.out.println("Kode : " + KodeKK);
    System.out.println("Tanggal: " + Tanggal);
    System.out.println("Nama : " + Nama);
    System.out.println("Kelurahan : " + Kelurahan);
    System.out.println("Alamat : " + Alamat);
    System.out.println("Rt : " + Rt);
    System.out.println("Rw : " + Rw);
    System.out.println("Keterangan : " + Keterangan);
    }
}
