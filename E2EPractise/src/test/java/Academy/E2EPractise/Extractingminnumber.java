package Academy.E2EPractise;

public class Extractingminnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*2 4 5

			3 4 7

			1 2 9*/
			//Maximum number from the array

			
			// TODO Auto-generated method stub

		  int abc[][]= {{-1,3,6},{4,5,7},{22,8,11}};
			int min=abc[0][0];
			int mincoloumn = 0;


			for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
			{
			if(abc[i][j]<min)//2
			{
			min=abc[i][j];
			mincoloumn=j;
			}
			}
			}
			//=1
			int max=abc[0][mincoloumn];
			int k = 0;
			while(k<3)
			{
			if(abc[k][mincoloumn]>max)
			{
			max=abc[k][mincoloumn];
			}
			k++;
			}

			System.out.println(max);
			

	}

}
