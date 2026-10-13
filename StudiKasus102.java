import java.util.Scanner;
public class StudiKasus102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = scanner.nextInt();
        totalHarga = hargaPerCup * jumlahCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }
        
        scanner.close();

    }
}
    
    

