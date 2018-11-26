import java.util.Scanner;

class Employee {
	private String name;
	private int id;
	public int salary;

	public Employee() {
		name = null;
		id = 0;
		salary = 0;
		
	}
	public Employee(String name, int id,int salary) {
		this.name = name;
		this.id = id;
		this.salary=salary;
	}
	
	public int getsalary(){
		return salary;
	}
	void showEmployeeDetails() {
		System.out.println(" Name : " + name);
		System.out.println(" id : " + id);
		System.out.println(" salary : " + salary);
		
	}
	public static void insert(Employee employee) {
		Scanner sc = new Scanner(System.in);

		employee.name = sc.nextLine();
		employee.id = sc.nextInt();
		employee.salary = sc.nextInt();
	}

}
public class SALARY {

	public static void main(String[] args) {
		Employee[] stArr = new Employee[5];

		System.out.println(" Enter the records as name,id and salary consecutively :");
		for(int i = 0; i < 5; ++i) {
			stArr[i] = new Employee();
			Employee.insert(stArr[i]);
			System.out.println();
		}

		
		for (int i=0;i<5 ;i++ ) {
			if(stArr[i].getsalary()>20000){
				stArr[i].showEmployeeDetails();

		}
			}



	}
}