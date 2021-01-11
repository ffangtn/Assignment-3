import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] String) {
		Scanner in= new Scanner (System.in);
		personalbackground();
		detailofcourses();
		coursestaken();
		coursecredithours();	
	}
	
	public static void personalbackground() {
		Scanner in= new Scanner (System.in);
		System.out.print("Enter your name : ");
		String name=in.next();
		
		System.out.print("Enter your IC no : ");
		String icno=in.next();
		
		System.out.print("Enter your age : ");
		String age =in.next();
		
		System.out.print("Gender : ");
		String gender=in.next();
		
		System.out.print("Enter your citizenship: ");
		String citizenship= in.next();
		
		System.out.print("Enter your marital status : ");
		String maritalstatus=in.next();
		
		System.out.print("Enter your Hp: ");
		String hp= in.next();
		
		System.out.println("Customer Personal Background");
		System.out.println();
		
		String pb[][] = {{"Name","IC NO","Age","Gender", "Citizenship","Marital status","Hp"},
					    {name,icno, age,gender,citizenship,maritalstatus,hp}};
		
				System.out.println(pb[0][0]+" : " +pb[1][0]);
				System.out.println(pb[0][1]+" : " +pb[1][1]);
				System.out.println(pb[0][2]+" : " +pb[1][2]);
				System.out.println(pb[0][3]+" : " +pb[1][3]);
				System.out.println(pb[0][4]+" : " +pb[1][4]);
				System.out.println(pb[0][5]+" : " +pb[1][5]);
				System.out.println(pb[0][6]+" : " +pb[1][6]);
				System.out.println();
	}
	
		
		public static void detailofcourses() {
		Scanner in= new Scanner (System.in);
		System.out.println("Details of Courses Provided");
		System.out.println();
		
		String courses1 = "Course 1       : Programming 1 " + System.lineSeparator()
						+ "Course Code    : STA1113" + System.lineSeparator()
						+ "Credit Hours   : 3 " + System.lineSeparator()
						+ "Class Time     : 10.00am-11.30am" + System.lineSeparator()
						+ "Days for Class : Monday and Thursday";
		
		String courses2 = "Course 2       : Mathematics For IT " + System.lineSeparator()
						+ "Course Code    : STQM1203" + System.lineSeparator()
						+ "Credit Hours   : 3 " + System.lineSeparator()
						+ "Class Time     : 2.30pm-4.00pm" + System.lineSeparator()
						+ "Days for Class : Sunday and Tuesday";					
		
		String courses3 = "Course 3       : Statistics For IT " + System.lineSeparator()
						+ "Course Code    : STQS1023"+ System.lineSeparator()
						+ "Credit Hours   : 3 " + System.lineSeparator()
						+ "Class Time     : 8.00am-9.30am" + System.lineSeparator()
						+ "Days for Class : Wednesday and Thursday"; 
		
		
		String coursesdetail[]= {courses1,courses2,courses3};
		for (int i=0; i<3;i++) {
			System.out.println(coursesdetail[i]);
			System.out.println();
		}
		}
		
		public static void coursestaken() {
		Scanner in= new Scanner (System.in);
		System.out.println();
		String courses1 = "Course 1       : Programming 1 " + System.lineSeparator()
						+ "Course Code    : STA1113" + System.lineSeparator()
						+ "Credit Hours   : 3 " + System.lineSeparator()
						+ "Class Time     : 10.00am-11.30am" + System.lineSeparator()
						+ "Days for Class : Monday and Thursday";

		String courses2 = "Course 2       : Mathematics For IT " + System.lineSeparator()
						+ "Course Code    : STQM1203" + System.lineSeparator()
						+ "Credit Hours   : 3 " + System.lineSeparator()
						+ "Class Time     : 2.30pm-4.00pm" + System.lineSeparator()
						+ "Days for Class : Sunday and Tuesday";					

		String courses3 = "Course 3       : Statistics For IT " + System.lineSeparator()
					 	+ "Course Code    : STQS1023"+ System.lineSeparator()
					 	+ "Credit Hours   : 3 " + System.lineSeparator()
					 	+ "Class Time     : 8.00am-9.30am" + System.lineSeparator()
					 	+ "Days for Class : Wednesday and Thursday"; 		

		int coursestaken;
		System.out.println("Courses Taken");
		System.out.print("Enter Total Courses Do You Want To Take : ");
	    	int courses = in.nextInt();
		if(courses==1) {
			System.out.print("What Courses Do You Want To Take? ");
			System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
			System.out.println();		
			System.out.print("1. What Courses Do You Want To Take : ");
			System.out.println();	
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			System.out.println();
			System.out.println("Congratulations. You are enrolled successfully!");
			
			System.out.println();	
			
		}else if(courses==2) {
			System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
			System.out.print("1. What Courses Do You Want To Take : ");
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			
			System.out.println();	
			System.out.print("2. What Courses Do You Want To Take : ");
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			System.out.println();
			System.out.println("Congratulations. You are enrolled successfully!");
			System.out.println();		
		
			
		}else if(courses==3) {
			System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
			System.out.print("1. What Courses Do You Want To Take : ");
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			System.out.println();	
			
			
			System.out.print("2. What Courses Do You Want To Take : ");
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			System.out.println();	
			
			System.out.print("3. What Courses Do You Want To Take : ");
			coursestaken =in.nextInt();
			if(coursestaken==1) {
				System.out.println(courses1);
			}
			else if(coursestaken==2) {
				System.out.println(courses2);
			}
			else if(coursestaken==3) {
				System.out.println(courses3);
			}
			else 
				System.out.println("Please enter valid number.");
			System.out.println();
			System.out.println("Congratulations. You are enrolled successfully!");
		}else 
				System.out.println("Please enter valid number. ");
		}
		public static void coursecredithours() {
			Scanner in= new Scanner (System.in);
			System.out.println();
			System.out.println("Calculation of Total Credit Hours");
			System.out.println();	
			System.out.print("Enter your total amount of courses taken:  ");
			int courses = in.nextInt();
			    System.out.println("Total Number of Courses Enrolled : " + courses);
			    System.out.println();	
				int coursescredit = (courses*3);
				System.out.println("Total Courses Credit Hours       : " + coursescredit);
			 
			}
		}
		
