public class coba5 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array integer dengan nilai awal
        int array[] = { 1, 2, 3, 4, 5 };

        // Mencetak header dengan format spesifik untuk menampilkan "Effects of passing
        // reference to entire array:" dan "The values of the original array are:"
        // %n digunakan untuk membuat baris baru
        System.out.printf("%nEffects of passing reference to entire array:%n" +
                "%nThe values of the original array are:%n");

        // Menggunakan loop enhanced for untuk mengiterasi setiap elemen dalam array
        // 'value' adalah variabel iterasi yang akan mengambil nilai dari setiap elemen
        // array
        for (int value : array)
            // Mencetak nilai dari setiap elemen array
            System.out.printf("     %d", value);

        // Memanggil metode modifyArray dengan array sebagai argumen
        // Metode ini akan memodifikasi setiap elemen dalam array
        modifyArray(array);

        // Mencetak header dengan format spesifik untuk menampilkan "The value of the
        // modified array are:"
        System.out.printf("%n%n The value of the modified array are:%n");

        // Menggunakan loop enhanced for untuk mengiterasi setiap elemen dalam array
        // yang telah dimodifikasi
        for (int value : array)
            // Mencetak nilai dari setiap elemen array yang telah dimodifikasi
            System.out.printf("     %d", value);

        // Mencetak nilai elemen array pada indeks 3 sebelum dan setelah memodifikasinya
        System.out.printf("%n%nEffects of passing reference to entire array:%n" +
                "%nArray[3] before modifyElement: %d%n", array[3]);
        modifyElement(array[3]);
        System.out.printf("Array[3] after modifyElement: %d%n", array[3]);
    }

    // Metode untuk memodifikasi setiap elemen dalam array
    public static void modifyArray(int[] array2) {
        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array
        for (int counter = 0; counter < array2.length; counter++)
            // Mengalikan setiap elemen dalam array dengan 2
            array2[counter] *= 2;
    }

    // Metode untuk memodifikasi elemen array tunggal
    public static void modifyElement(int element) {
        // Mengalikan elemen dengan 2
        element *= 2;
        // Mencetak nilai elemen yang telah dimodifikasi
        System.out.printf("Value of elements in modifyElements: %d%n", element);
    }
}
