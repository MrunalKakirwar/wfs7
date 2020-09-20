//Program displays the concept of constructor overloading.
//It contains a class Employee which has various types of constructors that initializes the object.
package com.hsbc.day2;

public class Employee {

		private String empName, empdesgn, empLocation;
		private int empId,	empAge, empExpInYrs;
		
		Employee(){}

		public Employee(String empName) {
				super();
				this.empName = empName;
			}
		
		public Employee(String empName, int empId) {
				super();
				this.empName = empName;
				this.empId = empId;
			}
		
		public Employee(String empName, int empId, int empAge) {
				super();
				this.empName = empName;
				this.empId = empId;
				this.empAge = empAge;
			}
		

		public Employee(String empName, String empdesgn, int empId) {
				super();
				this.empName = empName;
				this.empdesgn = empdesgn;
				this.empId = empId;
			}
		

		public Employee(String empName, String empdesgn, int empId, int empAge) {
				super();
				this.empName = empName;
				this.empdesgn = empdesgn;
				this.empId = empId;
				this.empAge = empAge;
			}
		

	

		public Employee(String empName, int empId, int empAge, int empExpInYrs) {
				super();
				this.empName = empName;
				this.empId = empId;
				this.empAge = empAge;
				this.empExpInYrs = empExpInYrs;
			}


		public Employee(String empName, String empdesgn, String empLocation, int empId, int empAge, int empExpInYrs) {
				super();
				this.empName = empName;
				this.empdesgn = empdesgn;
				this.empLocation = empLocation;
				this.empId = empId;
				this.empAge = empAge;
				this.empExpInYrs = empExpInYrs;
			}
		

	@Override
		public String toString() {
			return "Employee [empName=" + empName + ", empdesgn=" + empdesgn + ", empLocation=" + empLocation
					+ ", empId=" + empId + ", empAge=" + empAge + ", empExpInYrs=" + empExpInYrs + "]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Mrunu");
		Employee e1 = new Employee("Vishal",01);
		Employee e2 = new Employee("Rahul",02,23);
		Employee e3 = new Employee("Mish","TSE",03);
		Employee e4 = new Employee("Kuhu","SE",03,25);
		Employee e5 = new Employee("Kuki",04,22,6);
		Employee e6 = new Employee("Saru","TSE","Nagpur",05,20,2);
		
		System.out.println(e.toString());
		System.out.println("");
		System.out.println(e1.toString());
		System.out.println("");
		System.out.println(e2.toString());
		System.out.println("");
		System.out.println(e3.toString());
		System.out.println("");
		System.out.println(e4.toString());
		System.out.println("");
		System.out.println(e5.toString());
		System.out.println("");
		System.out.println(e6.toString());
	}

}
