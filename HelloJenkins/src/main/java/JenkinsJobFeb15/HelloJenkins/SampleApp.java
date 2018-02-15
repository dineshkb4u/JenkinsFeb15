package JenkinsJobFeb15.HelloJenkins;

public class SampleApp {
	
	static int empID;
	static int age;
	static double salary;
	static double vpay;

	public static void main(String[] args) {
		
		SampleApp s1 = new SampleApp();
		SampleApp.empID = 1041;
		s1.age = 28;
		s1.salary = 12345.55;
		s1.vpay = 123.23;
		
		System.out.println("Employee ID is "+ empID);
		System.out.println("Employee age is "+ age);
		System.out.println("Employee salary is "+ salary);
		System.out.println("Employee Variable Pay is "+ vpay);
		System.out.println("Hello All...");
		
	}

}
