package Arrays;

public class hw34 {

	public static void main(String[] args) {
		
		int[] a1= {0,0,0,0,1,2,3,4,5,6,7,8};
		int[] a2= {5,6,7,8,0,0,0};
		int[] a3= new int[a1.length+a2.length];
		int cnt=0;
		
		for (int i = 0; i < a1.length; i++) {
			
			a3[cnt]=a1[i];
			cnt++;
			
		}
		
		for (int i = 0; i < a2.length; i++) {
			
			a3[cnt]=a2[i];
			cnt++;
			
		}
		
		for(int p:a3)
		{
			System.out.print(p);
		}

	}

}
