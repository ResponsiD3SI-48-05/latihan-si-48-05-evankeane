import java.util.ArrayList;
import java.util.Scanner;

public class latihan2 {
    static ArrayList<Integer> angkaList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLanjut;
        
        System.out.println("Masukkan angka (akhiri dengan 'T' untuk berhenti):");

        do {
            System.out.print("Masukkan angka: ");
            int angka = scanner.nextInt();
            angkaList.add(angka);
            
            System.out.print("Lanjutkan input? (Y/T): ");
            inputLanjut = scanner.next();
        } while (!inputLanjut.equalsIgnoreCase("T"));
        
        int min = hitungMin();
        int max = hitungMax();
        double rataRata = hitungRataRata();
        
        System.out.println("Nilai minimal: " + min);
        System.out.println("Nilai maksimal: " + max);
        System.out.println("Nilai rata-rata: " + rataRata);
        scanner.close();
    }
    
    public static int hitungMin() {
        int min = angkaList.get(0);
        for (int angka : angkaList) {
            if (angka < min) {
                min = angka;
            }
        }
        return min;
    }

    public static int hitungMax() {
        int max = angkaList.get(0);
        for (int angka : angkaList) {
            if (angka > max) {
                max = angka;
            }
        }
        return max;
    }

    public static double hitungRataRata() {
        int total = 0;
        for (int angka : angkaList) {
            total += angka;
        }
        return (double) total / angkaList.size();
    }
}