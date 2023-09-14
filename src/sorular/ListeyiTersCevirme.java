package sorular;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListeyiTersCevirme {
	  public static void main(String[] args) {
	        // Kullan�c�dan bir c�mle almak i�in Scanner kullan�l�yor.
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir c�mle girin: ");
	        String cumle = scanner.nextLine();
	        
	        // C�mleyi ters �evirme i�lemi.
	        String tersCumle = tersCevir2(cumle);
	        
	        // Sonucu ekrana yazd�rma.
	        System.out.println("Ters �evrilmi� c�mle: " + tersCumle);
	        
	        // Scanner'� kapatma.
	        scanner.close();
	    }
	    
	    // Bir metni ters �eviren fonksiyon.
	    public static String tersCevir(String metin) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = metin.length() - 1; i >= 0; i--) {
	            sb.append(metin.charAt(i));
	        }
	        return sb.toString();
	    }
	    
	    public static String tersCevir2(String metin) {
	        char[] karakterler = metin.toCharArray(); //bir String'i karakter dizisine d�n��t�r�r. dizidir
	        int baslangic = 0;
	        int bitis = metin.length() - 1;
	        
	        while (baslangic < bitis) {  // burada yer de�i�tirme kullan�lm�� diyebilirz swarp
	            char gecici = karakterler[baslangic];
	            karakterler[baslangic] = karakterler[bitis];
	            karakterler[bitis] = gecici;
	            baslangic++;
	            bitis--;
	        }
	        
	        return new String(karakterler);
	    }
}
