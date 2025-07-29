public class coba3 {
    public static void main(String[] args) {
        // Mendeklarasikan konstanta ARRAY_LENGTH dengan nilai 10
        final int ARRAY_LENGTH = 10;
        // Mendeklarasikan array integer dengan nama 'array' dan menginisialisasikannya dengan ukuran ARRAY_LENGTH
        int array[] = new int[ARRAY_LENGTH];

        // Menggunakan loop for untuk mengisi array dengan nilai yang dihitung berdasarkan ekspresi 2+2*counter
        // 'counter' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'counter' kurang dari panjang array
        for (int counter = 0; counter < array.length; counter++)
            // Menghitung nilai untuk setiap elemen array berdasarkan ekspresi 2+2*counter dan menyimpannya ke dalam array
            array[counter] = 2 + 2 * counter;

        // Mencetak header tabel dengan format spesifik untuk menampilkan "index" dan "value"
        System.out.printf("%s%8s\n", "index", "value");

        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array
        // 'counter' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'counter' kurang dari panjang array
        for (int counter = 0; counter < array.length; counter++)
            // Menggunakan printf untuk mencetak indeks dan nilai dari setiap elemen dalam array
            // %5d mencetak nilai 'counter' (indeks) dengan lebar kolom 5, dan %8d mencetak nilai elemen array pada indeks 'counter' dengan lebar kolom 8
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }
}

