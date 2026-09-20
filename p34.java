
public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1和num2的各種運算:\n");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		System.out.println();
		
		int a=0, b=0, c=0;
		
		b = a++;
		c = ++a;
		
		System.out.println("因為是在指定值之後才遞增，所以b的值為"+b);
		System.out.println("因為是在遞增之後才指定值，所以c的值為"+c);		 
	}

}
