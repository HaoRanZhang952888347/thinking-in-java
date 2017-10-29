//:one/Exercise2_4

/*this is first thinking in java exercise program
*@author HaoRanZhang
*/

class DataOnly{
	int i;
	double d;
	boolean b;
}

public class Exercise2_4{
	public static void main(String[] args){
		DataOnly data = new DataOnly();
		data.i = 1;
		data.d = 0.01;
		data.b = false;
		System.out.println("答案1: "+data.i+" 答案2: "+data.d+" 答案3: "+data.b);
	}
}
