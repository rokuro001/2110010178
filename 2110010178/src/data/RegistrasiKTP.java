/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
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
   this.kodeKtp=kode;
   this.Tanggal=tgl;
   this.Nama=nama;
   this.Jenis_Permohonan=jenis;
   this.Kelurahan=kel;
   this.Alamat=alamat;
   this.Rt=rt;
   this.Rw=rw;
   this.Jk=jk;
   this.Agama=agama;
   this.Pekerjaan=pekerjaan;
   this.Kw=kw;
}

   
    

public void setkodektp(int kode){
    this.kodeKtp=kode;
}

public int getkodektp(){
    return this.kodeKtp;
}

public void settanggal(int tgl){
    this.Tanggal=tgl;
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

public void setjenis_permohonan(String jenis){
   this.Jenis_Permohonan=jenis;
}

public String getjenis_permohonan(){
    return this.Jenis_Permohonan;
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

 public void setjk(String jk){
    this.Jk=jk;
}

public String getjk(){
    return this.Jk;
}

 public void setagama(String agama){
    this.Agama=agama;
}

public String getagama(){
    return this.Agama;
}

 public void setpekerjaan(String pekerjaan){
    this.Pekerjaan=pekerjaan;
}

public String getpekerjaan(){
    return this.Pekerjaan;
}

 public void setkw(String kw){
    this.Kw=kw;
}

public String getkw(){
    return this.Kw;
}

   public void tampilkanDataRegistrasiKTP() {
    System.out.println("Kode : " + kodeKtp);
    System.out.println("Tanggal: " + Tanggal);
    System.out.println("Nama : " + Nama);
    System.out.println("Jenis Pemohonan : " + Jenis_Permohonan);
    System.out.println("Kelurahan : " + Kelurahan);
    System.out.println("Alamat : " + Alamat);
    System.out.println("Rt : " + Rt);
    System.out.println("Rw : " + Rw);
    System.out.println("Jenis Kelamin : " + Jk);
    System.out.println("Agama : " + Agama);
    System.out.println("Pekerjaan : " + Pekerjaan);
    System.out.println("Kwarganegaraan : " + Kw);
}
}
