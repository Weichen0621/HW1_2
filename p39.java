
public class p39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d = 2;
		double pi = 3.14;
		
		System.out.println("直徑是"+d+"公分的圓");
		System.out.println("其圓周為"+(d * pi)+"公分\n");	//int型態的變數d會轉變double型態來運算
		
		int num1 = 5;
		int num2 = 4;
		
		double div1 = num1 / num2;	//但若兩變數都是int型態，即使指定一double變數將結果存入，出來的值也會是int的結果(小數點後的值被捨棄，只有.0)
		double div2 = (double)num1 / (double)num2;
		
		System.out.println("5/4等於"+div1);
		System.out.println("5/4等於"+div2);		
		
	}

}
