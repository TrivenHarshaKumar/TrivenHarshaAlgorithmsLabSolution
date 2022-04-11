package algorithmslab;

public class Bubblesort {
	
	public int[] sort(int[] NumberArray)
	{
		boolean isSorted=false;
		int Length = NumberArray.length;
		while(!isSorted)
		{
			isSorted=true;
			for(int i=0;i<Length-1;i++)
			{
				if(NumberArray[i]<NumberArray[i+1])
				{
					int temp=NumberArray[i];
					NumberArray[i]=NumberArray[i+1];
					NumberArray[i+1]=temp;
					isSorted=false;
				}
			}
			Length--;
		}
		return NumberArray;
	}

}
