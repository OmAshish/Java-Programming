
public class Employee {
	
		private
			int empid;
			String ename;
			double basic_salary, hra, medical, pf,pt, net_salary, gross_salary;
			
		static String company = "HSBC";
		static int count = 100;
		
		static
		{
			company = "Apple";
//			empid = empid++;
			
		}
		
		public Employee()
			{
				count++;
				this.empid = count;
			}
		
		public Employee(String name, double bs, double medical)
			{
				this();
//				empid = id;
				ename = name;
				basic_salary = bs;
				this.medical = medical;
				hra = 0.5*basic_salary;
				pf = 0.12*basic_salary;
				pt = 200;
			}
			
//		public int getEmpid() {
//			return empid;
//		}
//		public void setEmpid(int empid) {
//			this.empid = empid;
//		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getBasic_salary() {
			return basic_salary;
		}
		public void setBasic_salary(double basic_salary) {
			this.basic_salary = basic_salary;
		}
		public double getNet_salary() {
			return net_salary;
		}
		public void setNet_salary(double net_salary) {
			this.net_salary = net_salary;
		}
		public double getGross_salary() {
			return gross_salary;
		}
		public void setGross_salary(double gross_salary) {
			this.gross_salary = gross_salary;
		}
		
		public double calculateGrossSalaray()
		{
			this.gross_salary = this.basic_salary+this.hra+this.medical;
			return this.gross_salary;
		}
		
		public double calculateNetSalaray()
		{
			this.net_salary = this.calculateGrossSalaray() - this.pf - this.pt;
			return this.net_salary;
		}
		
		
		public void printEmployee()
		{
			System.out.println("Employee id : "+empid);
			System.out.println("Employee name : "+ename);
			System.out.println("Employee basic salary : "+basic_salary);
			System.out.println("HRA : "+ hra);
			System.out.println("Medical : "+this.medical);
			System.out.println("PF : "+ pf);
			System.out.println("PT : "+200);
			System.out.println("Gross Salary : "+ calculateGrossSalaray());
			System.out.println("Net Salary : "+ calculateNetSalaray());
		}
}
