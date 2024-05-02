class Teacher {
	int id;
	String name;

		public statis void main(String args[])
	{
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

class Class {
	int id;
	String name;

		public statis void main(String args[])
	{
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

public class Student {
	private int student_id = 0;
	private String name;
	private String email;

	public Student(){} // class constructor
	
	public Student(int student_id, String name, String email){ // class accessor
		this.student_id = student_id;
		this.name;
		this.email;
	}

	public void setStudent_id(int newStudent_id){
		student_id = newStudent_id;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setEmail(String newEmail){
		email = newEmail;
	}

	public int getStudent_id(){
		return student_id;
	}

	public String getName(){
		return name;
	}

	public String getemail(){
		return email;
	}

}
