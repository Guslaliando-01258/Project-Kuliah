import java.io.*;
import java.util.*;

public class BeliATK {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Harga barang
        int bolpen = 2000;
        int pensil = 1000;
        int penghapusC = 500;
        
        // Input jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang A: ");
        int jumlahA = Integer.parseInt(reader.readLine());
        
        System.out.print("Masukkan jumlah barang B: ");
        int jumlahB = Integer.parseInt(reader.readLine());
        
        System.out.print("Masukkan jumlah barang C: ");
        int jumlahC = Integer.parseInt(reader.readLine());
        
        // Hitung total harga
        int total = (jumlahA * hargaA) + (jumlahB * hargaB) + (jumlahC * hargaC);
        
        // Tampilkan total harga
        System.out.println("Total harga pembelian: Rp " + total);
    }
}
