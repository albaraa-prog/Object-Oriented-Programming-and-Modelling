class Person {
	String name;
	int age;
	String gender; }
 
class dis
{
	public static void main(String args[])
	{
		Person ob1=new Person();
        ob1.age=22;ob1.gender="Male";ob1.name="Al Baraa";
		System.out.println("Age is:"+ob1.age);
		System.out.println("Gender is:"+ob1.gender);
		System.out.println("Name is:"+ob1.name);
	}
}