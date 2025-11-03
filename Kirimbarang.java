import java.util.Scanner;

public class Kirimbarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
         
        System.out.println("Masukkan panjang paket :");
        double panjang=input.nextDouble();
        System.out.println("Masukkan lebar paket :");
        double lebar=input.nextDouble();
        System.out.println("Masukkan tinggi paket :");
        double tinggi=input.nextDouble();
        double volume =panjang*tinggi*lebar;
        System.out.println("Masukkan jarak :");
        double jarak=input.nextDouble();
        System.out.println("Masukkan berat paket :");
        double beratpaket=input.nextDouble();
        double BiayaperKG;
        if(jarak<=10){
            BiayaperKG = 4250;
        }else{
            BiayaperKG=6000;
        }
        
        double totalBiaya=beratpaket*BiayaperKG;
        if(volume>100){
            totalBiaya+=50000;

    
        }
        

        System.out.println("Total Harga jarak :"+BiayaperKG);
        System.out.println("total volume : "+volume);
        
        System.out.println("total biaya :"+totalBiaya);

    }
    
}
