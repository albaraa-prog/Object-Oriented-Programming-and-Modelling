class cl
{   int d,f;
	void assign(int h)
	{
		d=h;
	}
	void c()
	{
		f=d*100;
		System.out.print(f);
	}
}
class disa
{
	public static void main(String args[])
	{
		cl ob1=new cl();
		ob1.assign(6);ob1.c();
	}
} 