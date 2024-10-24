import.java.until.Scanner;

public class Nomor1{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        
    
     System.out.print("Masukkan total penjualan salesman: Rp ");
     double totalPenjualan = scanner.nextDouble();

     double komisi = 0.0;

     if (totalPenjualan <= 500000) {
     komisi = totalPenjualan * 0.10; // 10% untuk penjualan sampai Rp 500.000
     } else {
     // Komisi untuk Rp 500.000 pertama
     komisi = 500000 * 0.10; // 10%
     // Menghitung sisa penjualan
     double sisaPenjualan = totalPenjualan - 500000;
    komisi += sisaPenjualan * 0.15; // 15% untuk sisa penjualan
        }

        System.out.printf("Total penjualan salesman: Rp %.2f%n", totalPenjualan);
        System.out.printf("Komisi yang didapatkan = Rp %.2f%n", komisi);

        scanner.close();

        
    }
}




      
 
