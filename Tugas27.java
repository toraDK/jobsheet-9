import java.util.Scanner;

public class Tugas27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlElemen = 0;
        double rata2 = 0;

        System.out.println("masukkan jumlah elemen : ");
        jmlElemen = sc.nextInt();
        int[] nilai = new int[jmlElemen];

        for(int i = 0; i < nilai.length; i++){
            System.out.print("Masukkkan nilai ke-"+ (i+1) + ":");
            nilai[i] = sc.nextInt();
        }

        for(int i = 0; i < nilai.length; i++){
            System.out.println("nilai ke-" + (i+1) + "adalah" + nilai[i]);
        }

        int max_num = nilai[0];
        int min_num = nilai[0];

        for(int i = 0; i < nilai.length; i++){
            if(nilai[i] > max_num){
                max_num = nilai[i];
            }else if(nilai[i] < min_num){
                min_num = nilai[i];
            }
            rata2 += nilai[i];
        }

        rata2 /= jmlElemen;

        System.out.println("nilai tertinggi adalah " + max_num);
        System.out.println("nilai terendah adalah " + min_num);
        System.out.println("nilai rata-rata adalah " + rata2);
    }
}
