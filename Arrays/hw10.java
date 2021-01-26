package Arrays;

public class hw10 {

	public static void main(String[] args) {
		
		int a[][]= {
				{34,56,65,65,98},
				{56,78,90,92,100},
				{56,34,87,54,78},
				{200,556,67,87,5},
				{98,56,543,76,576}
				};
		
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
			
		}
		System.out.println(max);
	}

}
