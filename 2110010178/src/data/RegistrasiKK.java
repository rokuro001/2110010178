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
        setkodekk(KodeKK);
        settanggal(Tanggal);
        setnama(Nama);
        setkelurahan(Kelurahan);
        setalamat(Alamat);
        setrt(Rt);
        setrw(Rw);
        setketerangan(Keterangan);
    }
    
    public void setkodekk(int kode){
    Scanner objku = new Scanner(System.in);
    System.out.println("Masukkan kode KTP : ");
    kode = objku.nextInt();
    this.KodeKK=kode;
}

public int getkodekk(){
    return this.KodeKK;
}

public void settanggal(int tanggal){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Tanggal : ");
        tanggal = objku.nextInt();
        this.Tanggal=tanggal;
    }
    
    public int gettanggal(){
        return this.Tanggal;
    }
    
    public void setnama(String nama){
        Scanner objku = new Scanner (System.in);
        System.out.println("Masukkan nama : ");
        nama = objku.nextLine();
        this.Nama=nama;
    }
    
    public String getnama(){
        return this.Nama;
    }
    
    public void setkelurahan(String kel){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Kelurahan : ");
        kel = objku.nextLine();
        this.Kelurahan=kel;
    }
    
    public String getkelurahan(){
        return this.Kelurahan;
    }
    
    public void setalamat(String alamat){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan alamat : ");
        alamat = objku.nextLine();
        this.Alamat=alamat;
    }
    
    public String getalamat(){
        return this.Alamat;
    }
    
    public void setrt(String rt){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan RT : ");
        rt = objku.nextLine();
        this.Rt=rt;
    }
    
    public String getrt(){
        return this.Rt;
    }
    
     public void setrw(String rw){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan RW : ");
        rw = objku.nextLine();
        this.Rw=rw;
    }
    
    public String getrw(){
        return this.Rw;
    }
    
    public void setketerangan(String ket){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Keterangan");
        ket = objku.nextLine();
        this.Keterangan=ket;
    }
    
    public String getketerangan(){
        return this.Keterangan;
    }
    
    public void tampilkanDataRegistrasiKK() {
        System.out.println("Kode : " + getkodekk());
        System.out.println("Tanggal: " + gettanggal());
        System.out.println("Nama : " + getnama());
        System.out.println("Kelurahan : " + getkelurahan());
        System.out.println("Alamat : " + getalamat());
        System.out.println("Rt : " + getrt());
        System.out.println("Rw : " + getrw());
        System.out.println("Keterangan : " + getketerangan());
    }
}
