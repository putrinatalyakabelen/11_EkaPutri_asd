public class PersegiPanjang11 {
  public int panjang;
  public int lebar;

  public PersegiPanjang11(int p , int l) {
    panjang = p;
    lebar= l;
  }
  public void cetakInfo() {
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar:  " + lebar);
  }
  public void hitungLuas() {
    int luas = panjang*lebar;
    System.out.println("Luas: "+ luas);
}
public void hitungKeliling() {
  int Keliling = 2 * (panjang + lebar);
  System.out.println("Keliling: " +Keliling);
}
}
