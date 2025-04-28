package java_inheritance;
//WAP on Abstract Class with both Abstract and Concrete methods
abstract class AbstractClassWithAandCMethodsParent
{
	void parentMethod1()
	{
		System.out.println("Parent Method 1");
	}
	
	void parentMethod2()
	{
		System.out.println("Parent Method 2");
	}
	
	abstract void parentMethod3();
	abstract void parentMethod4();
	//abstract void parentMethod5();
	
	
}
public class AbstractClassWithAandCMethodsChild extends AbstractClassWithAandCMethodsParent{

	void parentMethod3()
	{
		System.out.println("Parent Method 3");
	}
	void parentMethod4()
	{
		System.out.println("Parent Method 4");
	}
	
	void childMethod1()
	{
		System.out.println("Child Method 1");
	}
	void childMethod2()
	{
		System.out.println("Child Method 2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassWithAandCMethodsChild ac = new AbstractClassWithAandCMethodsChild();
		ac.parentMethod1();
		ac.parentMethod2();
		ac.parentMethod3();
		ac.parentMethod4();
		ac.childMethod1();
		ac.childMethod2();
	}

}
