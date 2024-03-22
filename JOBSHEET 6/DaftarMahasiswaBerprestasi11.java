public class DaftarMahasiswaBerprestasi11 {
    Mahasiswa11 listMhs[] = new Mahasiswa11[5];
    int idx;

    void tambah(Mahasiswa11 m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    void tampil(){
        for(Mahasiswa11 m : listMhs){
            m.tampil();
            System.out.println("-----------------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa11 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    //method inserttionSort()
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa11 temp = listMhs [i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) { // Perubahan dilakukan di sini > diubah menjadi <)
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
