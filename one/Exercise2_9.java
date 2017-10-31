//:one/exercise2_9

/*自动包装功能，将基本类型转换为包装器类型，并反向转换；包装器类型是啥？？
*@author HaoRanZhang
*/

public class Exercise2_9{
	public static void main(String[] args){
		Boolean bo = false;
		Character ch = 'x';
		Integer in = 10;
		Double dou = 0.01;
		
		boolean b = bo;
		char c = ch;
		int i = in;
		double d = dou;
		
		System.out.println(" Boolean:"+bo+" boolean:"+b);
		System.out.println(" Character:"+ch+" char:"+c);
		System.out.println(" Integer:"+in+" int:"+i);
		System.out.println(" Double:"+dou+" double:"+d);
	}
}
