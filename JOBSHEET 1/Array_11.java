import java.util.Scanner;

    /**
    *Array_11
    */
public class Array_11 {

public static void main(String[] args) {
    System.out.println("================================");
    System.out.println(" Program Menghitung IP Semester");
    System.out.println("================================");

    Scanner input = new Scanner(System.in);

    String[] MK = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking & Problem Solving",
    "Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan & Kesehatan Kerja"};
    int[] SKS = {2,2,2,3,2,2,3,2};
    double[] nilaiAngka = new double[8];
    String[] nilaiHuruf = new String[8];
    double[] bobotNilai = new double[8];
    double ip,totalIP = 0, ipSemester;
    int totalSKS = 0;

    for (int i = 0; i< MK.length;i++) {
        System.out.print("Masukkan Nilai Angka Untuk MK " + MK[i] + ":");
        nilaiAngka[i] = input.nextDouble();

        if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
            nilaiHuruf[i] = "A";
            bobotNilai[i] = 4;
        } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
            nilaiHuruf[i] = "B+";
            bobotNilai[i] = 3.5;
        } else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65) {
            nilaiHuruf[i] = "B";
            bobotNilai[i] = 3;
        } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
            nilaiHuruf[i] = "C+";
            bobotNilai[i] = 2.5;
        } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) { 
            nilaiHuruf[i] = "C";
            bobotNilai[i] = 2;
        } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) { 
            nilaiHuruf[i] = "D";
            bobotNilai[i] = 1;
        } else if (nilaiAngka[i] <= 39){
            nilaiHuruf[i] = "E";
            bobotNilai[i] = 0;
        } else if (nilaiAngka[i] > 100 && nilaiAngka[i] < 1){
            nilaiAngka[i] = 0;
            nilaiHuruf[i] = "Tidak Valid";
            bobotNilai[i] = 0;
        }
}
System.out.println("======================");
System.out.println(" Hasil Konversi Nilai");
System.out.println("======================");

System.out.printf("%-40s %-15s %-15s %-15s \n", "Mk", "Nilai Angka", " Nilai Huruf","Bobot Nilai");
for (int i = 0;i < MK.length;i++){
    System.out.printf("%-43s %-17s %-14s %1s \n", MK[i],nilaiAngka[i],nilaiHuruf[i], bobotNilai[i]);
}
for (int i = 0;i < MK.length;i++){
    ip = bobotNilai[i] * SKS[i];
    totalIP += ip;
    totalSKS += SKS[i];
}
ipSemester = totalIP/totalSKS;
System.out.printf("IP Anda Adalah " + "%.2f", ipSemester);
}
}

