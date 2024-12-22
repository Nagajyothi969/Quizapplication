
import java.util.*;
public class QUIZMAIN {
public static void main(String args[]) throws InterruptedException {
	try {
	Question q=new Question();
	System.out.println("***********QUIZZ APPLICATION***************");
	Scanner sc=new Scanner(System.in);
	QUIZ d=new QUIZ();
	System.out.println("Welcome to the Quiz Game!");
	System.out.println("FILL YOUR DETAILS.....");
	System.out.println("Please Enter Your Name: ");
	d.setName(sc.next());
	System.out.println("Please Enter Your age : ");
	d.setAge(sc.nextInt());
	System.out.println("Please Enter Your Address : ");
	d.setPhoneno(sc.nextLong());
	System.out.println("Please Enter Your Email : ");
	d.setEmail(sc.next());
	System.out.println("----------YOUR DETAILS-------------");
	System.out.println("Name: "+d.getName());
	System.out.println("age : "+d.getAge());
	System.out.println("Mobile no : "+d.getPhoneno());
	System.out.println("Email : "+d.getEmail());
	
	//QUIZ STARTTING
	System.out.println("***********RULEs**********");

	System.out.println("==>Each question has 4 option");
	System.out.println("==>The parcipant has 2 life lines:1.50_50Life, 2:Audience poll");
	System.out.println("==>User gives wrong answer terminate him with total amount he won");
	System.out.println("==>correct answer:1.reward, 2.next question");
	
	System.out.println("IF YOU AGREE WITH ABOVE RULES ENTER ' 1' TO CONTINUE ELSE '0' TO QUIT");
    System.out.println("ARE YOU READY FOR THE QUIZZ....??");
	System.out.println(" '1' for YES  ::::  '0' for NO ");
	 int b=sc.nextInt();
	if(b==0) {
		System.out.println("YOU EXIT SUCCESFULLY");
		System.exit(0);
	}
	else {
    q.question1();
    q.question2();
    
    
   
    q.question3();
    
    q.question4();
    
   
    
}}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic exception was found");
	}
	
}

}