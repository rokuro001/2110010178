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
public class RegistrasiKTP {
    private int kodeKtp;
    private int Tanggal;
    private String Nama;
    private String Jenis_Permohonan;
    private String Kelurahan;
    private String Alamat;
    private String Rt;
    private String Rw;
    private String Jk;
    private String Agama;
    private String Pekerjaan;
    private String Kw;
    
public RegistrasiKTP(){}

public RegistrasiKTP(int kode, int tgl, String nama, String jenis, String kel, String alamat, String rt, String rw, String jk, String agama, String pekerjaan, String kw){
    setkodektp(kodeKtp);
    settanggal(Tanggal);
    setnama(Nama);
    setjenis_permohonan(Jenis_Permohonan);
    setkelurahan(Kelurahan);
    setalamat(Alamat);
    setrt(Rt);
    setrw(Rw);
    setjk(Jk);
    setagama(Agama);
    setpekerjaan(Pekerjaan);
    setkw(Kw);
}

   
    

public void setkodektp(int kode){
    Scanner objku = new Scanner(System.in);
    System.out.println("Masukkan kode KTP : ");
    kode = objku.nextInt();
    this.kodeKtp=kode;
}

public int getkodektp(){
    return this.kodeKtp;
}

public void settanggal(int tgl){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Tanggal : ");
        tgl = objku.nextInt();
        this.Tanggal=tgl;
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
    
    public void setjenis_permohonan(String jenis){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Jenis Permohonan : ");
        jenis = objku.nextLine();
        this.Jenis_Permohonan=jenis;
    }
    
    public String getjenis_permohonan(){
        return this.Jenis_Permohonan;
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
    
     public void setjk(String jk){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan Jenis Kelamin : ");
        jk = objku.nextLine();
        this.Jk=jk;
    }
    
    public String getjk(){
        return this.Jk;
    }
    
     public void setagama(String agama){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan Agama : ");
        agama = objku.nextLine();
        this.Agama=agama;
    }
    
    public String getagama(){
        return this.Agama;
    }
    
     public void setpekerjaan(String pekerjaan){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan Pekerjaan : ");
        pekerjaan = objku.nextLine();
        this.Pekerjaan=pekerjaan;
    }
    
    public String getpekerjaan(){
        return this.Pekerjaan;
    }
    
     public void setkw(String kw){
        Scanner objku=new Scanner(System.in);
        System.out.println("Masukkan Kwarganegaraan : ");
        kw = objku.nextLine();
        this.Kw=kw;
    }
    
    public String getkw(){
        return this.Kw;
    }
    
       public void tampilkanDataRegistrasiKTP() {
        System.out.println("Kode : " + getkodektp());
        System.out.println("Tanggal: " + gettanggal());
        System.out.println("Nama : " + getnama());
        System.out.println("Jenis Pemohonan : " + getjenis_permohonan());
        System.out.println("Kelurahan : " + getkelurahan());
        System.out.println("Alamat : " + getalamat());
        System.out.println("Rt : " + getrt());
        System.out.println("Rw : " + getrw());
        System.out.println("Jenis Kelamin : " + getjk());
        System.out.println("Agama : " + getagama());
        System.out.println("Pekerjaan : " + getpekerjaan());
        System.out.println("Kwarganegaraan : " + getkw());
    }
}
