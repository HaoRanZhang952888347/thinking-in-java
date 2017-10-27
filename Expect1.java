// Expect1.java

public class Expect1{
	public static void main(String[] args){
		int i = 9;
		{
			int x = 10;
			System.out.println(i+"和"+x);//可使用字段i和x
		}
		System.out.println(i);//x在作用域之外，只能使用字段i
	}
}
