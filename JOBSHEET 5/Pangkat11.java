public class Pangkat11 {
    
    public int nilai,pangkat;

public int pangkatBf11 (int a,int n) {
    int hasil = 1;
    for (int i = 0; i < n; i++) {
        hasil = hasil * a;
    }
    return hasil;
}
public int pangkatDC11 (int a,int n) {
    if (n==0) {
        return 1;
    }
    else {
        if (n%2==1) {
            return (pangkatDC11(a, n/2)*pangkatDC11(a,n/2)*a);
        } else {
            return (pangkatDC11(a, n/2)*pangkatDC11(a, n/2));
        }
    }
}
public Pangkat11() {
    this.nilai = nilai;
    this.pangkat = pangkat;
}
public Pangkat11 (int nilai2,int pangkat2) {

}
}