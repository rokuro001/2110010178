/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010178;
import data.*;
import dataset.*;
import java.util.Scanner;
import forms.*;

/**
 *
 * @author Rudia
 */
public class Main {
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
//        
//        
//        
//         Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masukkan username: ");
//        String username = scanner.nextLine();
//
//        System.out.print("Masukkan password: ");
//        String password = scanner.nextLine();
//
//        if (username.equals("admin") && password.equals("admin")) {
//            System.out.println("Login successful. Welcome, admin!");
//            
//            System.out.println("Isi Data Dibawah ini : ");
//            Scanner pilih = new Scanner (System.in);
//            System.out.print("Pilih : ");
//            int pilihan;
//             boolean validpilihan = false;
//
//        while (!validpilihan) {
//            System.out.println("Menu:");
//            System.out.println("1. Registrasi KTP");
//            System.out.println("2. Registrasi KK");
//            System.out.println("3. Data Pemilik");
//            System.out.println("4. Laporan");
//            System.out.print("Enter your choice: ");
//            pilihan = scanner.nextInt();
//            pilih.nextLine(); // Consume the newline character
//                switch (pilihan) {
//                    case 1 -> {
//                        datasetRegistrasiKTP regKtp = new datasetRegistrasiKTP();
//                        System.out.println("Registrasi KTP : ");
//                        regKtp.insertKodektp(01);
//                        regKtp.inserttanggal("09 january 2003");
//                        regKtp.insertNama("Rudiani");
//                        regKtp.insertjenis("Registrasi KTP");
//                        regKtp.insertkelurahan("Murung Pudak");
//                        regKtp.insertalamat("Pasar Panas");
//                        regKtp.insertRT("04");
//                        regKtp.insertRW("-");
//                        regKtp.insertjenis_kelamin("Laki-laki");
//                        regKtp.insertagama("Islam");
//                        regKtp.insertpekerjaan("Mahasiswa");
//                        regKtp.insertKwarganegaraan("Indonesia");
//                        validpilihan = true;
//                    }
//                    case 2 -> {
//                        System.out.println("Registrasi KK : ");
//                        RegistrasiKK objk = new RegistrasiKK(1,1,"nama","kel","alamat","rt","rw","ket");
//                        objk.tampilkanDataRegistrasiKK();
//                        validpilihan = true;
//                    }
//                    case 3 -> {
//                        System.out.println("Laporan data Pemilik : ");
//                        Datapemilik ob1 = new Datapemilik(1,12,"Rudiani","ktp","murung pudak","kasiau","04","-","Laki-laki","Islam","Swasta","indonesia");
//                        ob1.tampilkanDatapemilik();
//                        validpilihan = true;
//                    }
//                    case 4 -> {
//                        System.out.println("Laporan data Pengambilan : ");
//                        Laporan ob2 = new Laporan(1,1,"pengambil","jenis",1,"status");
//                        ob2.tampilkanLaporan();
//                        validpilihan = true;
//                    }
//                    default -> System.out.println("Pilihan tidak ada,Masukkan Pilihan : ");
//                }
//        }
//
//        scanner.close();
//    
//            
//            
//        } else {
//            System.out.println("Isi Data Dibawah ini : ");
//            Scanner pilih = new Scanner (System.in);
//            int pilihan;
//             boolean validpilihan = false;
//
//        while (!validpilihan) {
//            System.out.println("Menu:");
//            System.out.println("1. Pengambilan KTP");
//            System.out.println("2. Pengambilan KK");
//            System.out.print("Enter your choice: ");
//            pilihan = scanner.nextInt();
//            pilih.nextLine(); // Consume the newline character
//                switch (pilihan) {
//                    case 1 -> {
//                        System.out.println("Pengambilan KTP : ");
//                        PengambilanKtp obj = new PengambilanKtp(1,1,"pemilik","pengambil","kel","ket");
//                        obj.tampilkanDataPengambilanKTP();
//                        validpilihan = true;
//                    }
//                    case 2 -> {
//                        System.out.println("Pengambilan KK : ");
//                        PengambilanKK ob1 = new PengambilanKK(1,1,1,"KepalaKK","pengambil","kel","alamat","ket");
//                        ob1.tampilkanDataPengambilanKK();
//                        validpilihan = true;
//                    }
//                    default -> System.out.println("Pilihan tidak ada,Masukkan Pilihan : ");
//                }
//        }
//
//        scanner.close();
//        }
        
        new frameUtama().setVisible(true);
     
    }
    
}
