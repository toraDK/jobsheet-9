import java.util.Scanner;

public class ArrayRataNilai27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs= new int[10]; 
        double rata2lulus = 0, ratatdklulus = 0;
        int lulus = 0, jumlahmhs = 0, tidaklulus = 0;
        int jumlahlulus = 0, jumlahtdklulus = 0;

        for(int i = 0; i < nilaiMhs.length; i++){ 
            System.out.print ("Masukkan nilai mahasiswa ke-"+(i+1)+": "); 
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            if(nilaiMhs[i] > 70){
                lulus += nilaiMhs[i];
                jumlahlulus += 1;
                rata2lulus = (double) lulus / jumlahlulus;
            }else{
                tidaklulus += nilaiMhs[i];
                jumlahtdklulus += 1;
                ratatdklulus = (double)tidaklulus / jumlahtdklulus;
            }
        }

        System.out.println("Rata-rata nilai lulus: " + rata2lulus);
        System.out.println("Rata-rata tidak lulus: " + ratatdklulus);
    }
}
