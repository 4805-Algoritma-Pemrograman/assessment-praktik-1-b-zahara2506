import.java.until.Scanner;

public class Nomor2{
    public static void main(String[] args){
    Scanner scaner = new Scaner (system.in);
    // Tarif per malam dan biaya pelayanan
        double[] tarip = {0, 50000, 40000, 30000};
        double[] biayaPelayananPersen = {0, 0.30, 0.20, 0.10}; 
        
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            // Input kode bungalow
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
            
            // Input lama menginap
            System.out.print("lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();
            
            // Hitung biaya menginap dan biaya pelayanan
            double biayaMenginap = lamaMenginap * tarip[kodeBungalow];
            double biayaPelayanan = biayaMenginap * biayaPelayananPersen[kodeBungalow];
            double totalBiaya = biayaMenginap + biayaPelayanan;
            
            // Update total pendapatan dan jumlah transaksi
            totalPendapatan += totalBiaya;
            jumlahTransaksi++;
            
            // Tanya pengguna untuk input lagi
            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

        // Output hasil
        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);
        
        scanner.close();
      

    }
}
