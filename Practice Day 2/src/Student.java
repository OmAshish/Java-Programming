
public class Student {
	int rollnumber;
	String sname;
	private double marks;
	
	public double getMarks(){ //Accessor OR GETTER
		return this.marks;
	}
	
	public void setMarks(double marks) //MODIFIER OR SETTER
	{
		this.marks = marks;
	}
	
	public Student(){
//		this("abc",89.99);
		rollnumber = 2;
	}
	
	public Student( String name, double percentage) 
	{
		this();
//		rollnumber = rn;
		this.sname = name;
		this.marks = percentage;
	}
	public void printStudent()
	{
		System.out.println("Roll Number: "+rollnumber);
		System.out.println("Name : "+sname);
		System.out.println("Marks : "+marks);
	}
}
