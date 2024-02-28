 /**
 * tugas2
 */
public class Tugas2_11 {
    public static void main(String[] args) {
        int rating [][] = {
            {4, 1, 1},
            {3, 1, 2},
            {4, 2, 3},
            {4, 3, 4},
        };
        float total;
        float rataRata = 0;
        float tinggi = 0;
        float rendah = 0;
        int tertinggi = 0;
        int terendah = 0;
        for(int i = 0; i<rating.length; i++ ){
            total = 0;
            for(int j=0; j<rating[0].length; j++){
            total += rating[i][j];
        }
        rataRata = total / rating[i].length;
        System.out.println("Rata-Rata Rating Movie "+i+" Adalah "+ rataRata);

        if (rataRata > tinggi) {
            tinggi = rataRata;
            tertinggi = i;
        }else if(rataRata < rendah){
            rendah = rataRata;
            terendah = i;
        }
    }
    System.out.println("Movie Dengan Rata-rata Rating Tertinggi Adalah Movie "+tertinggi);
    System.out.println("Movie Dengan Rata-rata Rating Terendah Adalah Movie "+terendah);
}
}

