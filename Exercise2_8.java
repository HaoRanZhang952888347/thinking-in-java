//:one/Exercise2_8

/*
*@author HaoRanZhang
*/

class StaticTest{
	static String s="我";
}

public class Exercise2_8{
	public static void main(String[] args){
		StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    StaticTest st3 = new StaticTest();
    
    st2.s = "我今天";
    st3.s = "我今天吃鸡了";
    System.out.println(" st1:"+st1.s+" st2:"+st2.s+" st3:"+st3.s);		
	}
}
