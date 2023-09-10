
public class q_1 {
	public static int func(int n){
		
		if(n==1) {
			return 1;
		}
		return n+ func(n-1);
		 
		 
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= func(5);
System.out.println(a);
	}

}
