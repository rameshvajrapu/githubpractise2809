package Academy.E2EPractise;

public class sample implements CentralInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello This is Ramesh");
		
		System.out.println("hello this is khatvik");
		
		Methods m= new Methods();
		m.HeaderValidation();
		
		String g="Ramesh";
		for(int i=g.length()-1;i>=0;i--)
		{
			System.out.println(g.charAt(i));
		}
	
		CentralInt d=new sample();
		d.flashyellow();
		d.GoGreen();
		d.Stopred();

	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implementation");
	}

	@Override
	public void Stopred() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implementation");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yellow Implementation");
	}

}
