package Com.ExPrograms;

public class IndianTrafic implements centraltrafic,LocalTrafic{

	

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red implemented");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green implemented");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method st
		System.out.println("yellow implemented");
	}


public static void main(String[] args) {
		

 centraltrafic c=new IndianTrafic();
 c.red();
 c.green();
 c.yellow();
 LocalTrafic l=new IndianTrafic();
 l.symbol();
 
}

@Override
public void symbol() {
	// TODO Auto-generated method stub
	System.out.println("symbol implemented");
}}
