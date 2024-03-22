public class LatihanParktikum {
        public static void main(String[] args) {
            System.out.println("=========================================================================");
            int number = 25; // Ubah bilangan yang ingin dihitung akarnya
            double bruteForceResult = bruteForceSqrt(number);
            double divideConquerResult = divideConquerSqrt(number);
            System.out.println("=========================================================================");
    
            System.out.println("Akar dari " + number + " dengan Brute Force adalah: " + bruteForceResult);
            System.out.println("Akar dari " + number + " dengan Divide Conquer adalah: " + divideConquerResult);
            System.out.println("============================================================================");
        }
    
        // Algoritma Brute Force
        public static double bruteForceSqrt(int x) {
            if (x == 0 || x == 1) {
                return x;
            }
            double i = 1;
            while (i * i <= x) {
                i++;
            }
            return (int) i - 1; // Bulatkan ke bawah
        }
    
        // Algoritma Divide Conquer
        public static double divideConquerSqrt(int x) {
            if (x == 0 || x == 1) {
                return x;
            }
            double start = 1, end = x, ans = 0;
            while (start <= end) {
                double mid = (start + end) / 2;
                if (mid * mid == x) {
                    return mid;
                }
                if (mid * mid < x) {
                    start = mid + 1;
                    ans = mid;
                } else {
                    end = mid - 1;
                }
            }
            return (int) ans; // Bulatkan ke bawah
        }
    }
    
    

