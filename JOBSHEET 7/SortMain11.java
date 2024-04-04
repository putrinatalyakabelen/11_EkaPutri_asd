public class SortMain11 {
    
        public static void main(String[] args) {
            int data[] = {10,40,30,50,70,20,100,90};
            System.out.println("Sorting dengan merge sort");
            MergeSorting11 mSort = new MergeSorting11();
            System.out.println("---------------------");
            System.out.println("Data awal");
            System.out.println("---------------------");
            mSort.printArray(data);
            mSort.mergeSort(data);
            System.out.println("----------------------");
            System.out.println("Setelah di urutkan");
            System.out.println("----------------------");
            mSort.printArray(data);
        }
    }
