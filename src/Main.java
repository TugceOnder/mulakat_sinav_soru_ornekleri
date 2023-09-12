import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int elemanSayisi = scanner.nextInt();

        int[] sayilar = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }

        int enBuyukSayi = findEnBuyukSayi(sayilar);
        System.out.println("Girilen sayılar arasında en büyük sayı: " + enBuyukSayi);

        scanner.close();
    }

    private static int findEnBuyukSayi(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Dizi boş olamaz.");
        }

        int enBuyuk = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > enBuyuk) {
                enBuyuk = array[i];
            }
        }
        return enBuyuk;
    }
}