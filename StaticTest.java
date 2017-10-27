// StaticTest.java

class Test{
  static int i = 2;
}

public class StaticTest{
	public static void main(String[] args){
		Test test1 = new Test();
		Test test2 = new Test();
		++test1.i;
		System.out.println("答案1:"+test1.i+"  答案2:"+test2.i);//test1.i和test2.i的值相同，
		                                                        //因为static，两个对象指向同一内存地址
	}
}
