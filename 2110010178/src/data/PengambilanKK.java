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
        setkodeKK(KodeKK);
        setTanggal(tanggal);
        setNoKK(noKK);
        setnamaKepalaKK(NamaKepalaKK);
        setnamaPengambil(NamaPengambil);
        setKelurahan(Kelurahan);
        setAlamat(Alamat);
        setKeterangan(keterangan);
    }
    
    public void setkodeKK(int kode){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Kode KK : ");
        kode = objku.nextInt();
        this.KodeKK=kode;
    }
    
    public int getkodeKK(){
        return this.KodeKK;
    }
    
    public void setTanggal(int tgl){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Tanggal : ");
        tgl = objku.nextInt();
        this.tanggal=tgl;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public void setNoKK(int no){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan No KK : ");
        no = objku.nextInt();
        this.noKK=no;
    }
    
    public int getNoKK(){
        return this.noKK;
    }
    
    public void setnamaKepalaKK(String kepalaKK){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Nama Kepala KK : ");
        kepalaKK = objku.nextLine();
        this.NamaKepalaKK=kepalaKK;
    }
    
    public String getnamaKepalaKK(){
        return this.NamaKepalaKK;
    }
    
    public void setnamaPengambil(String pengambil){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Pengambil : ");
        pengambil = objku.nextLine();
        this.NamaPengambil=pengambil;
    }
    
    public String getnamaPengambil(){
        return this.NamaPengambil;
    }
    
    
    public void setKelurahan(String kel){
        Scanner objku = new Scanner(System.in);
        System.out.println("Kelurahan : ");
        kel = objku.nextLine();
        this.Kelurahan=kel;
    }
    
    public String getKelurahan(){
        return this.Kelurahan;
    }
    
    public void setAlamat(String alamat){
        Scanner objku = new Scanner(System.in);
        System.out.println("Alamat : ");
        alamat = objku.nextLine();
        this.Alamat=alamat; 
    } 
    
    public String getAlamat(){
        return this.Alamat;
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
    
       public void tampilkanDataPengambilanKK() {
        System.out.println("Kode : " + getkodeKK());
        System.out.println("Tanggal: " + getTanggal());
        System.out.println("No KK : " + getNoKK());
        System.out.println("Nama Kepala KK : " + getnamaKepalaKK());
        System.out.println("Nama Pengambil : " + getnamaPengambil());
        System.out.println("Kelurahan : " + getKelurahan());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Keterangan : " + getKeterangan());
    }
}
