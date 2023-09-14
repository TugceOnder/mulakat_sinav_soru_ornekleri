package sorular;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListeyiTersCevirme {
	  public static void main(String[] args) {
	        // Kullanýcýdan bir cümle almak için Scanner kullanýlýyor.
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir cümle girin: ");
	        String cumle = scanner.nextLine();
	        
	        // Cümleyi ters çevirme iþlemi.
	        String tersCumle = tersCevir2(cumle);
	        
	        // Sonucu ekrana yazdýrma.
	        System.out.println("Ters çevrilmiþ cümle: " + tersCumle);
	        
	        // Scanner'ý kapatma.
	        scanner.close();
	    }
	    
	    // Bir metni ters çeviren fonksiyon.
	    public static String tersCevir(String metin) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = metin.length() - 1; i >= 0; i--) {
	            sb.append(metin.charAt(i));
	        }
	        return sb.toString();
	    }
	    
	    public static String tersCevir2(String metin) {
	        char[] karakterler = metin.toCharArray(); //bir String'i karakter dizisine dönüþtürür. dizidir
	        int baslangic = 0;
	        int bitis = metin.length() - 1;
	        
	        while (baslangic < bitis) {  // burada yer deðiþtirme kullanýlmýþ diyebilirz swarp
	            char gecici = karakterler[baslangic];
	            karakterler[baslangic] = karakterler[bitis];
	            karakterler[bitis] = gecici;
	            baslangic++;
	            bitis--;
	        }
	        
	        return new String(karakterler);
	    }
}
