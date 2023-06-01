/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


/**
 *
 * @author Rudia
 */
public class PengambilanKK {
    private int KodeKK;
    private int tanggal;
    private int noKK;
    private String NamaKepalaKK;
    private String NamaPengambil;
    private String Kelurahan;
    private String Alamat;
    private String keterangan;
    
    
    public PengambilanKK(){}
    
    public PengambilanKK(int kode, int tgl, int no, String kepalaKK, String pengambil, String kel, String alamat, String ket){
        this.KodeKK = kode;
        this.tanggal = tgl;
        this.noKK = no;
        this.NamaKepalaKK=kepalaKK;
        this.NamaPengambil=pengambil;
        this.Kelurahan=kel;
        this.Alamat=alamat;
        this.keterangan=ket;
    
    }
    
    public void setkodeKK(int kode){
        this.KodeKK=kode;
    }
    
    public int getkodeKK(){
        return this.KodeKK;
    }
    
    public void setTanggal(int tgl){
        this.tanggal=tgl;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNoKK(int no){
        this.noKK=no;
    }
    
    public int getNoKK(){
        return this.noKK;
    }
    
    public void setnamaKepalaKK(String kepalaKK){
        this.NamaKepalaKK=kepalaKK;
    }
    
    public String getnamaKepalaKK(){
        return this.NamaKepalaKK;
    }
    
    public void setnamaPengambil(String pengambil){
        this.NamaPengambil=pengambil;
    }
    
    public String getnamaPengambil(){
        return this.NamaPengambil;
    }
    
    
    public void setKelurahan(String kel){
        this.Kelurahan=kel;
    }
    
    public String getKelurahan(){
        return this.Kelurahan;
    }
    
    public void setAlamat(String alamat){
        this.Alamat=alamat; 
    } 
    
    public String getAlamat(){
        return this.Alamat;
    }
    
    public void setKeterangan(String ket){
        this.keterangan=ket;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
    
       public void tampilkanDataPengambilanKK() {
        System.out.println("Kode : " + KodeKK);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("No KK : " + noKK);
        System.out.println("Nama Kepala KK : " + NamaKepalaKK);
        System.out.println("Nama Pengambil : " + NamaPengambil);
        System.out.println("Kelurahan : " + Kelurahan);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Keterangan : " + keterangan);
    }
}
