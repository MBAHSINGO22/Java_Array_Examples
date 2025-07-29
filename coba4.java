public class coba4 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array integer dengan nilai awal
        int array[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        // Mendeklarasikan variabel integer 'total' untuk menyimpan total dari semua elemen dalam array
        int total = 0;

        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array
        // 'counter' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'counter' kurang dari panjang array
        for (int counter = 0; counter < array.length; counter++)
            // Menambahkan nilai dari setiap elemen array ke variabel 'total'
            total += array[counter];

        // Mencetak total dari semua elemen dalam array menggunakan printf
        System.out.printf("Total of array elements: %d\n", total);
    }
}

