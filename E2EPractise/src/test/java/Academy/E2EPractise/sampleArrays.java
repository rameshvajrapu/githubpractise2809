package Academy.E2EPractise;

public class sampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[6];
		a[0]=2;
		a[1]=7;
		a[2]=8;
		a[3]=12;
		a[4]=67;
		a[5]=546;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			}
		int b[]= {4,6,8,7788,454,76576};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
			}
		
		int c[][]=new int[3][2];
		c[0][0]=11;
		c[0][1]=55;
		c[1][0]=44;
		c[1][1]=33;
		c[2][0]=66;
		c[2][1]=77;
		
		System.out.println(c[2][0]);
		
		int d[][]= {{2,4,6},{3,9,15},{4,8,12}};
		System.out.println(d[1][2]);
		
		
	}
	
	

}
