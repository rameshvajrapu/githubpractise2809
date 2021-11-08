package Academy.E2EPractise;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,3,6},{4,5,7},{22,8,10004}};
		int Max=abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (abc[i][j]>Max)
				{
					Max=abc[i][j];
				}
				
			}
		}		
		
		System.out.println("Maxium Value=" +Max);

	}

}
