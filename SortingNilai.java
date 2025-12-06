public class SortingNilai {

    static int bubbleSortAscending(int[] data) {
        int n = data.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    static int bubbleSortDescending(int[] data) {
        int n = data.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {

        int[] nilai = {85, 92, 77, 90, 88, 70, 95};

        System.out.println("=== DATA AWAL ===");
        for (int n : nilai) System.out.print(n + " ");
        System.out.println("\n");

        int[] asc = nilai.clone();
        int[] desc = nilai.clone();

        int swapAsc = bubbleSortAscending(asc);

        System.out.println("\n=== SORT ASCENDING (Kecil → Besar) ===");
        for (int n : asc) System.out.print(n + " ");
        System.out.println("\nSwap/Iterasi: " + swapAsc);

        int swapDesc = bubbleSortDescending(desc);

        System.out.println("\n=== SORT DESCENDING (Besar → Kecil) ===");
        for (int n : desc) System.out.print(n + " ");
        System.out.println("\nSwap/Iterasi: " + swapDesc);

        int tertinggi = desc[0];
        int terendah = asc[0];

        System.out.println("\n=== NILAI TERTINGGI & TERENDAH ===");
        System.out.println("Tertinggi : " + tertinggi);
        System.out.println("Terendah  : " + terendah);
    }
}
