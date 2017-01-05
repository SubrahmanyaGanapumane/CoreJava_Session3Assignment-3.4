import java.util.Scanner;
class Student{
	int s1,s2,s3; //Subject-1, Subject-2, Subject-3
	double avg;
	
	Student(int s1,int s2, int s3){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		avg=(s1+s2+s3)/3.0;
	}
	double getAvg(){
		return avg;
		
	}
}

public class Assignment3_4 {
	static double class_avg;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int n= sc.nextInt();
		int sub1,sub2,sub3;
		double avg;
		
		Student stdList[]= new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student"+(i+1)+ " obtained marks in three subjects: ");
			sub1=sc.nextInt();
			sub2=sc.nextInt();
			sub3=sc.nextInt();
			Student s=new Student(sub1,sub2,sub3);
			avg=s.getAvg();
			class_avg+=avg;
			System.out.println("Your avarage marks is"+avg);
			stdList[i]=s;
			if(avg>=85)
			{
				System.out.println("Congratulation you got Distinction!!");
				
			}
			else if(avg>=70)
			{
				System.out.println("First class");
			}
			else if(avg>=60)
			{
				System.out.println("Second class");
			}
			else if(avg>=45)
			{
				System.out.println("You passed");
			}
			else{
				System.out.println("Fail");
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("Class avarage marks is: "+class_avg/n);
		
		
		
	}

}
