import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
    private ArrayList<Barang> dafBarang = new ArrayList<>();

    // Method untuk menambah barang elektronik
    public void TambahBarangElektronik(){
        // Scanner 
        Scanner scanner = new Scanner(System.in);
        // Input Nama Barang, Jumlah Barang, Harga Barang, Garansi Barang
        System.out.print("Masukkan nama barang :");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah barang :");
        String jumlah = scanner.nextLine();
        System.out.print("Masukkan harga barang :");
        String harga = scanner.nextLine();
        System.out.print("Masukkan garansi barang :");
        String garansi = scanner.nextLine();
    }
        // Membuat objek barang elektronik baru
        BarangElektronik barang = new BarangElektronik(nama,jumlah,harga,garansi);
        dafBarang.add(barang);

    // Method untuk menambah barang non-elektronik
    public void TambahBarangNonElektronik(){
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Input Nama Barang, Jumlah Barang, Harga Barang, Material Barang
        System.out.print("Masukkan nama barang :");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah barang :");
        String jumlah = scanner.nextLine();
        System.out.print("Masukkan harga barang :");
        String harga = scanner.nextLine();
        System.out.print("Masukkan garansi barang :");
        String garansi = scanner.nextLine();
        // Membuat objek barang non-elektronik baru

    }
    // Method untuk menampilkan semua barang memakai if-else (jika tidak ada barang akan menampilkan tidak ada barang dalam inventaris)

}
