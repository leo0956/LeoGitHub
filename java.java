/*
	This is my java program v1.0

*/
public class testAA {
	public static void main(String[] args){

		BB b = new BB();
		b.CC();
	}
}

class AA{

	String name;
	int age;

	public AA(){
	}
}

class BB extends AA
{
	String name;
	int age;

	public void CC(){
		System.out.println("hello java");
	}
}