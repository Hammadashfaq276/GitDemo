package TestNg;

public class PS2 extends PS3 {

	int a;
    public PS2(int a)
    {
    	super(a);
    	
    }

	public int Increment()
	{
		a=a+1;
		return a;
	}
	
	public int Decrement()
	{
		a=a-1;
		return a;
	}
}
