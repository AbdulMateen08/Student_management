package Studentmangement;
import java.util.*;
public class Student_info { // define the a class for student info 
	String name;
	int grade;

	Student_info(String name , int grade){  // constructor to initize the varablies 
		this.name=name;
		this.grade=grade;
	}
		void display_info() {       //display method to display the info of the student
			System.out.println("The name of the student is "+ name);
			System.out.println("The grade of the student is "+ grade);
		
	}
	
}
 class Student_mangement{       //define the student_mangement class to manage the student name and grade
	 ArrayList<Student_info> students;    // array list to store the student  info into a list the name of the list is "students" 
	 
	 Student_mangement(){             // constructor to initize the obj of students arraylist 
		 students=new ArrayList();
	 }
	 void addStudent(Student_info student) {     // add mehtod to add the data of class "Student_info " with array list 
		 students.add(student);                   // adding the  student data into the array list of students
		 System.out.println("Student is add "+ student.name);  // dispalying the name of the student whoes data is added 
		 
	 }
	 void displayallstudents() {                   // with thsi  mehtod we will display the array list of all the students 
		 for(Student_info student:students) {
			 student.display_info();               // by using the display info method we display the info of students
		 }
	 }
	
}
 
 class main{                                         // main class
	 public static void main(String args[]) {   
		 Student_mangement managemnt = new Student_mangement();    // creating the obj  for the mangemetn class 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the details ");
		 String name = sc.next();
		 int grade = sc.nextInt();
		 
		 Student_info student1=new Student_info(name,grade);	   //creating the obj for the Student_info class so that we can add 
		 															// values to  the class info
		
		 
		 managemnt.addStudent(student1);                            // by using the obj of managemnt class we are adding the values to the 
		 															// array list of managemnt class
		
		 managemnt.displayallstudents();							// with this we are displaying the students details 
		 
	 }
 }
 