import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int jumlahPelanggan;
        
        System.out.println("========================================");
        System.out.println("   PROGRAM PENJUALAN TIKET BIOSKOP");
        System.out.println("========================================");
        System.out.println("Harga Tiket: Rp " + HARGA_TIKET + " per tiket");
        System.out.println("Diskon:");
        System.out.println("- Beli > 4 tiket  : Diskon 10%");
        System.out.println("- Beli > 10 tiket : Diskon 15%");
        System.out.println("========================================\n");
        
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();
        System.out.println();
        
        for (int i = 1; i <= jumlahPelanggan; i++) {
            int jumlahTiket;
            
            while (true) {
                System.out.print("Pelanggan ke-" + i + " - Jumlah tiket: ");
                jumlahTiket = sc.nextInt();
                
                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                    System.out.println("Silakan input ulang.\n");
                    continue; // Minta input ulang
                }
                
                if (jumlahTiket == 0) {
                    System.out.println("Pelanggan tidak membeli tiket.\n");
                    break;
                }
                
                break;
            }
            
            if (jumlahTiket == 0) {
                continue;
            }
            
            double hargaSebelumDiskon = jumlahTiket * HARGA_TIKET;
            double diskon = 0;
            double hargaSetelahDiskon;
            
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
                System.out.println("Mendapat diskon 15%");
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
                System.out.println("Mendapat diskon 10%");
            } else {
                System.out.println("Tidak mendapat diskon");
            }
            
            hargaSetelahDiskon = hargaSebelumDiskon - (hargaSebelumDiskon * diskon);
            
            System.out.println("Harga sebelum diskon: Rp " + String.format("%,.0f", hargaSebelumDiskon));
            if (diskon > 0) {
                System.out.println("Potongan harga: Rp " + String.format("%,.0f", (hargaSebelumDiskon * diskon)));
            }
            System.out.println("Total bayar: Rp " + String.format("%,.0f", hargaSetelahDiskon));
            System.out.println();
            
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaSetelahDiskon;
        }
        
        System.out.println("========================================");
        System.out.println("       RINGKASAN PENJUALAN HARI INI");
        System.out.println("========================================");
        System.out.println("Total Tiket Terjual  : " + totalTiketTerjual + " tiket");
        System.out.println("Total Penjualan      : Rp " + String.format("%,.0f", totalPenjualan));
        System.out.println("========================================");
        
        sc.close();
    }
}