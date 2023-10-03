package sorular;

import java.util.Scanner;

public class MukemmelSayilar {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Bir say� girin: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        if (sum == number) {
	            System.out.println(number + " bir m�kemmel say�d�r.");
	        } else {
	            System.out.println(number + " bir m�kemmel say� de�ildir.");
	        }
}}