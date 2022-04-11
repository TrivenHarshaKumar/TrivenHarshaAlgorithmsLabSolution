package algorithmslab;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubblesort bs = new Bubblesort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrencyDenominations = sc.nextInt();
		int[] DenominationsArray = new int[sizeOfCurrencyDenominations];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<sizeOfCurrencyDenominations;i++)
		{
			DenominationsArray[i] = sc.nextInt();
		}
		bs.sort(DenominationsArray);
		System.out.println("Enter the amount you want to pay");
		int amount =sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0;i<sizeOfCurrencyDenominations;i++)
		{
			int count=0;
		
			if(amount/DenominationsArray[i]>0)
			{
				count = amount/DenominationsArray[i];
				amount =amount%DenominationsArray[i];
			}
			if(amount!=0 && i == sizeOfCurrencyDenominations-1)
			{
				count++;
			}
			if(count>0)
			System.out.println(DenominationsArray[i]+":"+count);
		}
		sc.close();
	}

}
