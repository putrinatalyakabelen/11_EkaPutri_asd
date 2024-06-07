import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa11 {
    List<Mahasiswa11> mahasiswas = new ArrayList<>();

        public void tambah(Mahasiswa11... mahasiswa) {
                mahasiswas.addAll(Arrays.asList(mahasiswa));
        }

        public void hapus(int index) {
                mahasiswas.remove(index);
        }

        public void update(int index, Mahasiswa11 mhs) {
                mahasiswas.set(index, mhs);
        }

        public void tampil() {
                mahasiswas.stream().forEach(mhs -> {
                        System.out.println("" + mhs.toString());
                });
        }
    // no 3 //
    void ascendingSort() {
        this.mahasiswas.sort((Mahasiswa11 d1, Mahasiswa11 d2) -> d1.nama.compareTo(d2.nama));
    }

    void descending() {
        this.mahasiswas.sort((Mahasiswa11 d1, Mahasiswa11 d2) -> d2.nama.compareTo(d1.nama));

    }
   
        int LinearSearch(String nim) {
                for(int i=0; i<mahasiswas.size(); i++) {
                        if(nim.equals(mahasiswas.get(i).nim)) {
                                return i;
                        }
                }
                return -1;
        }

        public static void main(String[] args) {
                ListMahasiswa11 lm = new ListMahasiswa11();
                Mahasiswa11 m = new Mahasiswa11("201234", "Noureen", "021xx1");
                Mahasiswa11 m1 = new Mahasiswa11("201235", "Akhleema", "021xx2");
                Mahasiswa11 m2 = new Mahasiswa11("201236", "Shannum", "021xx3");

                // Menambahkan Objek Mahasiswa
                lm.tambah(m, m1, m2);
                // Menampilkan List Mahasiswa
                lm.tampil();
                // Update Mahasiswa
                lm.update(lm.LinearSearch("201235"), new Mahasiswa11("201235", "Akhleema Lela", 
                "021xx2"));
                System.err.println("");
                lm.tampil();
               
        Mahasiswa11 key = new Mahasiswa11("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator11()),
                new Mahasiswa11("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();
        System.out.println("\n");

        System.out.println("Ascending : ");
        lm.ascendingSort();
        lm.tampil();

        System.out.println("\n");

        System.out.println("Descending : ");
        lm.descending();
        lm.tampil();
    }
}


    
