package T1;

public class t1 {
	public static void main(String[] args) {
		int a,sum=0;
		for(a=1;a<100;a++)
		{
			if(a%2!=0)
				sum=a+sum;
		}
		System.out.println("1到99所有奇数和   "+sum);
}
	 
}      
