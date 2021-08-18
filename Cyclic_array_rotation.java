METHOD 1 :

import java.util.Arrays;
 
public class Test
{
    static int arr[] = new int[]{1, 2, 3, 4, 5};
     
    // Method for rotation
    static void rotate()
    {
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
     
    /* Driver program */
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
         
        rotate();
         
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}


METHOD 2 :


import java.util.Arrays;

public class Test
{
	static int arr[] = new int[]{1, 2, 3, 4, 5};
	
	
	static void rotate()
	{
	int i = 0, j = arr.length - 1;
	while(i != j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
	}
	}
	
	/* Driver program */
	public static void main(String[] args)
	{
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		rotate();
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
}


