import java.util.Scanner;
/**
 * BubbleSortExample27
 */
public class LinearSearch27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 0;
        int hasil = 0;
        boolean cari = false;
        int elemen = 0;

        System.out.println("masukkan jumlah elemen array : ");
        elemen = sc.nextInt();
        int[] array = new int[elemen];

        for(int i = 0; i < array.length; i++){
            System.out.println("Masukkan elemen array ke-" +i+ ":");
            array[i] = sc.nextInt();
        }

        System.out.println("masukkan key yang ingin dicari :");
        key = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                hasil = i;
                cari = true;
                break;
            }
        }

        if(cari){
            System.out.println("key ada dalam posisi index ke-" + hasil);
        }else{
            System.out.println("key tidak ditemukan dalam array");
        }

    }
}