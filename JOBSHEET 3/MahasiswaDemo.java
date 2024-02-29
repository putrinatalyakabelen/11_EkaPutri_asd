import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa11 = new Mahasiswa11[3];

        double total,rataRata;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa11[i] = new Mahasiswa11();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayOfMahasiswa11[i].nama = sc11.nextLine();
            System.out.print("Masukkan nim mahasiswa: ");
            arrayOfMahasiswa11[i].nim = sc11.nextInt();
            System.out.print("Masukkan jenis kelamin Mahasiswa: ");
            arrayOfMahasiswa11[i].jenisKelamin = sc11.next();
            System.out.print("Masukkan Ipk Mahasiswa: ");
            arrayOfMahasiswa11[i].Ipk = sc11.nextDouble();

            sc11.nextLine();

        }
        System.out.println();
        System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + arrayOfMahasiswa11[i].nama);
                System.out.println("Nim: " + arrayOfMahasiswa11[i].nim);
                System.out.println("Jenis kelamin: " + arrayOfMahasiswa11[i].jenisKelamin);
                System.out.println("Ipk: " + arrayOfMahasiswa11[i].Ipk);
    
            }
            total = 0;
            for (int i = 0; i < arrayOfMahasiswa11.length; i++) {
                total = total+ arrayOfMahasiswa11[i].Ipk;
            }
            rataRata = total / arrayOfMahasiswa11.length;

            System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }