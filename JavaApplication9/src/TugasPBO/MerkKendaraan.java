package TugasPBO;

import java.util.Scanner;

class MerkKendaraan extends Manusia {

    Scanner baca = new Scanner(System.in);
    String merk4, merk2;
    
    @Override
     protected void jenisModifan() {
        System.out.print(" Mobil = ");
        mobil = baca.next();
        System.out.print(" Motor = ");
        motor = baca.next();
    }  

    protected void merkkendaraan() {
        System.out.print("Merk Kendaraan roda 4 =");
        merk4 = baca.next();
        System.out.print("Merk Kendaraan roda 2 =");
        merk2 = baca.next();
    }
}
