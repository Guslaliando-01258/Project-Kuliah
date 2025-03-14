import java.io.*;
import java.util.*;

public class AlatTulis {
    public static void main(String[] args) {
        // Harga barang
        int harga_bolpen = 2000;
        int harga_pensil = 1000;
        int harga_penghapus = 500;

        int jumlah_bolpen = 4; 
        int jumlah_pensil = 2; 
        int jumlah_penghapus = 5; 

        // Hitung total harga per barang
        int total_bolpen = jumlah_bolpen * harga_bolpen;
        int total_pensil = jumlah_pensil * harga_pensil;
        int total_penghapus = jumlah_penghapus * harga_penghapus;
        int total = total_bolpen + total_pensil + total_penghapus;

        // Tampilkan harga dan jumlah setiap barang
        System.out.println("\nRincian Pembelian:");
        System.out.println("Bolpen      : " + jumlah_bolpen + " x Rp " + harga_bolpen + "    = Rp " + total_bolpen);
        System.out.println("Pensil      : " + jumlah_pensil + " x Rp " + harga_pensil + "    = Rp " + total_pensil);
        System.out.println("Penghapus   : " + jumlah_penghapus + " x Rp " + harga_penghapus + "     = Rp " + total_penghapus);

        // Tampilkan total harga
        System.out.println("Total harga pembelian: Rp " + total);
    }
}
