import.java.until.Scanner;

public class Nomor2{
    public static void main(String[] args){
    Scanner scaner = new Scaner (system.in);
        
        double[] tarip = {0, 50000, 40000, 30000};
        double[] biayaPelayananPersen = {0, 0.30, 0.20, 0.10}; 
        
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
           
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
          
            System.out.print("lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();
            
          
            double biayaMenginap = lamaMenginap * tarip[kodeBungalow];
            double biayaPelayanan = biayaMenginap * biayaPelayananPersen[kodeBungalow];
            double totalBiaya = biayaMenginap + biayaPelayanan;
            
           
            totalPendapatan += totalBiaya;
            jumlahTransaksi++;
            
         
            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

       
        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);
        
        scanner.close();      
    

     }
}
