package sorular;

import java.util.Scanner;

public class Enbuyuksayibulma {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        System.out.print("Kaç tane sayý gireceksiniz? ");
	        int sayiAdedi = scan.nextInt();

	        int enbuyuk = 0;
	        /* en buyuk elemanýný bulabilmek icin
	        "enbuyuk" degýskenýne en kucuk degeri veriyoruz*/
	      
	        
	        for(int i = 0; i < sayiAdedi; i++)
	        {
	            System.out.print("Dizinin " + (i+1) + ". elemanýný giriniz: ");
	            int girilenSayi  = scan.nextInt();
	            if(girilenSayi > enbuyuk) {
	                enbuyuk = girilenSayi;
	            }
	        }
	        System.out.println("Dizinin en buyuk elemaný = " + enbuyuk);
	    }

}
