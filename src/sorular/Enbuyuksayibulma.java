package sorular;

import java.util.Scanner;

public class Enbuyuksayibulma {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        System.out.print("Ka� tane say� gireceksiniz? ");
	        int sayiAdedi = scan.nextInt();

	        int enbuyuk = 0;
	        /* en buyuk eleman�n� bulabilmek icin
	        "enbuyuk" deg�sken�ne en kucuk degeri veriyoruz*/
	      
	        
	        for(int i = 0; i < sayiAdedi; i++)
	        {
	            System.out.print("Dizinin " + (i+1) + ". eleman�n� giriniz: ");
	            int girilenSayi  = scan.nextInt();
	            if(girilenSayi > enbuyuk) {
	                enbuyuk = girilenSayi;
	            }
	        }
	        System.out.println("Dizinin en buyuk eleman� = " + enbuyuk);
	    }

}
