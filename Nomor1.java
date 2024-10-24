
import.java.until.Scanner;
public class Nomor1{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        
     System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = scanner.nextDouble();
        
        // Variabel untuk menyimpan komisi
        double komisi = 0.0;

        // Menghitung komisi berdasarkan ketentuan
        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10;
        } else {
            // Komisi untuk Rp 500.000 pertama
            komisi = 500000 * 0.10;
            // Menghitung sisa penjualan
            double sisaPenjualan = totalPenjualan - 500000;
            // Komisi untuk sisa penjualan
            komisi += sisaPenjualan * 0.15;
        }

        // Output hasil
        System.out.printf("Total penjualan salesman: %.0f\n", totalPenjualan);
        System.out.printf("Komisi yang didapatkan = %.1f\n", komisi);
        
        scanner.close();
    }
}




      
 
