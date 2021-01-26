package Arrays;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "s1", 71);
		Student s2 = new Student(2, "s2", 72);
		Student s3 = new Student(3, "s3", 73);
		Student s4 = new Student(4, "s4", 74);
		Student s5 = new Student(5, "s5", 100);
		Student s6 = new Student(6, "s6", 76);
		Student s7 = new Student(7, "s7", 77);
		Student s8 = new Student(8, "s8", 78);
		Student s9 = new Student(9, "s9", 79);
		Student s0 = new Student(0, "s0", 70);
		
		Student[] a = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s0};
		
		
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i].marks>a[j].marks)
				{
					Student temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
	a[a.length-1].display();
	

	}

}
