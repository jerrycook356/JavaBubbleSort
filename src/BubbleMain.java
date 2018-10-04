
public class BubbleMain {

	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		bubbleSort(intArray);
		print(intArray);

	}
	
	/**@pre none
	 * @post the index1 and index2 will be swapped position in the array
	 * @param array the array the indexes will be swapped from
	 * @param index1 the index of the first element to swap
	 * @param index2 the index of the second element to swap*/
	
   public static void swap(int[] array, int index1, int index2)
   {
	   if(index1 == index2)
		   return;
	   else
	   {
		   int temp;
		   temp = array[index1];
		   array[index1]= array[index2];
		   array[index2] = temp;
	   }
   }
   /**
    * @param intArray the array to sort
    * @post the array will be in sorted order
    */
   public static void bubbleSort(int[] intArray)
   {
	   for(int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0; lastUnsortedIndex--)
		{
			for(int i = 0; i< intArray.length-1 ;i++)
			{
				if(intArray[i] > intArray[i+1])
				{
					swap(intArray,i,i+1);
				}
			}
		}
   }
   
   public static void print(int[] array)
   {
	   for(int i = 0; i < array.length;i++)
	   {
		   System.out.println(array[i]);
		   
	   }
   }
}
