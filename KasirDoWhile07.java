import java.util.Scanner;

public class KasirDoWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        double totalHarga;
        String namaPelanggan;

        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.\n");
                break; // keluar dari perulangan jika pelanggan mengetik 'batal'
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            sc.nextLine(); 
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            System.out.println();

        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
