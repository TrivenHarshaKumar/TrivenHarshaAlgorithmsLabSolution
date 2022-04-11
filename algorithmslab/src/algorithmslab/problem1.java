package algorithmslab;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int sizeOfTransactions = sc.nextInt();
		System.out.println("Enter the values of array");
		int Trasactions[] = new int[sizeOfTransactions];
		for(int i=0;i<sizeOfTransactions;i++)
		{
			Trasactions[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		
		for(int i=0;i<noOfTargets;i++)
		{
			boolean isTargetAchieved =false;
			System.out.println("Enter the value of target");
			int Target = sc.nextInt();
			int sum=0;
			for(int j=0;j<sizeOfTransactions;j++)
			{
				sum=sum+Trasactions[j];

				if(sum>=Target)
				{
					isTargetAchieved=true;
					System.out.println("Target achieved after "+(j+1)+" transactions");
					break;
				}
			}
			if(!isTargetAchieved)
			{
				System.out.println("Given target is not achieved");
			}
		}

	}

}
