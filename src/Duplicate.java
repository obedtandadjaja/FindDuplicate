/**
 * Finds Duplicates in O(N) time 
 * @author obedtandadjaja
 */
public class Duplicate {

	public static void main(String[] args)
	{
		int[] array = {5,4,2,4,5,2,3,0,7,7,0,1,12};
		getDuplicate(array);
	}
	
	public static void getDuplicate(int arr[])
	{
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[Math.abs(arr[i])] > 0) {
	            arr[Math.abs(arr[i])] *= -1;
	        } else {
	            System.out.println(Math.abs(arr[i]));
	        }
	    }
	}
}
