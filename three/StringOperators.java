//:three/StringOperators.java

/**输出字符串的转换
*@author Thinking in java
*/

public class StringOperators{
	public static void main(String[] args){
		int x = 0,y = 1,z = 2;
		String s = "x, y, z";
		System.out.println(s + x + y+ z);//x,y,z012
		System.out.println(x +" "+s);//0 x,y,z
		s += "(summed) = ";
		System.out.println(s + (x + y + z));//x,y,z(summed)=3
		System.out.println(" "+x);// 0
		
	}
}
