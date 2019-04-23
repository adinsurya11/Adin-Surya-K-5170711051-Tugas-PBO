package TugasPBO;

import java.util.Scanner;

class KendaraanKesukaan extends Manusia {

    Scanner baca = new Scanner(System.in);
    String jenis, type;

    @Override
     protected void jenisModifan() {
        System.out.print(" Mobil = ");
        mobil = baca.next();
        System.out.print(" Motor = ");
        motor = baca.next();
    }  

    public void kendaraankesukaan() {
        System.out.print("Roda 2 atau Roda 4  = ");
        jenis=baca.next();
        System.out.print("Type Kendaraan = ");
        type = baca.next();
    }
}
