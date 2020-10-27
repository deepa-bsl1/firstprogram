import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] originalarray = {1,2,3,4,5,6,7,8,9};
		int [] duplicatearray = new int[6];
		
		System.arraycopy(originalarray, 3, duplicatearray, 0, 4);
		for(int i=0;i<duplicatearray.length;i++)
		{
		System.out.println(duplicatearray[i]);
		

	}

		int[] array2=Arrays.copyOfRange(originalarray, 2, 7);
		
		System.out.println("Printing second array");
		
		for (int j=0;j<array2.length;j++)
		{
			System.out.print(array2[j]);
		}
		
		
		int [] array3=originalarray.clone();
		
		System.out.println("printing cloned array");
		for (int k=0;k<array3.length;k++)
		{
			System.out.println(array3[k]);
		}
		
		int [][][] multiarray=new int[3][3][2];
		//int int int [][][]multiarray= {{1,2,3},{3,4,5},{6,7}};
		
		multiarray[0][0][0]=50;
		multiarray[0][0][1]=101;
		System.out.println("array[0][0][0]=" +multiarray[0][0][0]);
		System.out.println("array[0][0][0]=" +multiarray[0][0][1]);
		
		int [][] twodimarray= {{5,6},{4,8}};
		
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<2;y++)
				
			{
				System.out.println("twodimarray[" +x+ "][" +y+ "] =" +twodimarray[x][y]);
				
			}
		}
		
		
		
}
}

