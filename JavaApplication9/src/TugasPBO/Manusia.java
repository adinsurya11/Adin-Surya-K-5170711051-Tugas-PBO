
package TugasPBO;

import java.util.Scanner;
public class Manusia {
     Scanner baca = new Scanner(System.in);
    String nama, usia, alamat,mobil,motor,hobi,kendaraan;
    public void identitas() {
        System.out.print("Nama                  =   ");
        nama = baca.next();
        System.out.print("Alamat                =   ");
        alamat = baca.next();
        System.out.print("Usia                  =   ");
        usia = baca.next();
        
    }

    protected void jenisModifan() {
        System.out.print(" Mobil = ");
        mobil = baca.next();
        System.out.print(" Motor = ");
        motor = baca.next();
    }  
    protected void hobi() {
        System.out.println("Nama Hobi :");
        hobi=baca.next();    
    }
    protected void kendaraan(){
        System.out.println("Kendaraan Yang Paling Sering digunakan :");
        kendaraan=baca.next();
    }
}