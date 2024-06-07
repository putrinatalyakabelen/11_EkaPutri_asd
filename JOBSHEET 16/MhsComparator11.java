import java.util.Comparator;
public class MhsComparator11 implements Comparator<Mahasiswa11>{
    
        public int compare(Mahasiswa11 mhs1, Mahasiswa11 mhs2) {
            if (mhs1.nim == mhs2.nim) {
                return 0;
            } else {
    
                return -1;
            }
        }
    
        @Override
        public Comparator<Mahasiswa11> reversed() {
            return Comparator.super.reversed();
        }
}
