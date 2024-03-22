/**
 * BruteForceDivideConquer11
 */

public class Faktorial11 {

    public int nilai;

    public int faktorialBF11 (int n) {
        int fakto11 = 1;
        int i = 1;
        while (i <= n) {
            fakto11 = fakto11 * i;
            i++;
        }
        return fakto11;
    }

    public int faktorialDC11 (int n) {
        if (n==1) {
            return 1;
        }
        else {
            int fakto11 = n * faktorialDC11(n-1);
            return fakto11;
        }
    }
}