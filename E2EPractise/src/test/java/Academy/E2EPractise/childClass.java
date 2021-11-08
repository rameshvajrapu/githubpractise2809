package Academy.E2EPractise;

public class childClass extends parentClass {
	
	
	
	
	
	public void AudioSystem()
	
	{
		System.out.println("Audiosystem code is implemented in Child class");
	}
	
public void ActualBikemechanism()
	
	{
		System.out.println("ActualBikemechanism is implemented");
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass cc=new childClass();
		cc.AudioSystem();
		cc.ActualBikemechanism();
		cc.Color();
		cc.Wheels();
		
		int a[][]= new int[2][3];
		a[0][0]=5;
		a[0][1]=6;
		a[0][2]=8;
		a[1][0]=55;
		a[1][1]=65;
		a[1][2]=63;
		System.out.println(a[1][0]);
		
		int b[][]= {{2,10,20},{3,15,30}};
		System.out.println(b[1][2]);
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
			}
			
			
		}
		
		

	}

	@Override
	public void Color() {
		System.out.println("color code is implemented");
		
	}

}
