import java.util.Scanner;

public class latihan1 {
    static int tahun = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa Lama anda bekerja :");
        tahun = input.nextInt();
        int hasilGajiMurni = hitungGajiMurni(tahun);

        System.out.println("Masukkan Total Jam Lembur :");
        int jamLembur = input.nextInt();
        int HasilJamLembur = hitungjamLembur(jamLembur);

        System.out.println("Total Gaji Anda Adalah : "+hasilGajiMurni+HasilJamLembur);

    }

    static int hitungjamLembur(int jamLembur){
        int honor = 0;
        if (tahun < 5 ) {
            honor = 40000 * jamLembur;
        }else if (tahun >= 5) {
            honor = 50000 * jamLembur;
        }else if (tahun > 10) {
            honor = 75000 * jamLembur;
        }
        return honor;
    }

    static int hitungGajiMurni(int tahun){
        int gajiMurni = 0;
        if (tahun < 5) {
            gajiMurni = 5000000;
        }else if (tahun >= 5) {
            gajiMurni = 75000000;
        }else if (tahun > 10) {
            gajiMurni = 10000000;
        }

        return gajiMurni;
    }

}