import java.util.*;
/**
 *
 * @author ginaanifahchoirunnisa
 * @modified by Deo
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-->composition
		
		Major major1 = new Major
				("Teknik Komputer dan Informatika",new Program("D4 Teknik Informatika"));
		
		Major major2 = new Major
				("Teknik Komputer dan Informatika",new Program("D3 Teknik Informatika"));
		
		
		//-->aggregation
		ArrayList<Contact> contact1 = new ArrayList<>();
		contact1.add(new Contact("+62-749905880"));
		contact1.add(new Contact("+62-123511559"));
		
		ArrayList<Contact> contact2 = new ArrayList<>();
		contact2.add(new Contact("+62-374726002"));
		contact2.add(new Contact("+62-349902607"));
		
		ArrayList<Contact> contact3 = new ArrayList<>();
		contact3.add(new Contact("+62-114075238"));
		contact3.add(new Contact("+62-952762413"));
		
		
		ArrayList<Students> student = new ArrayList<>();
		
		//Association
		Class Class1 = new Class("1A",student);
		Students student1 = new Students("student1","281682",Class1);
		Students student2 = new Students("student2","152715",Class1);
		Students student3 = new Students("student3","25385",Class1);
		
		//masuk ke student ---> Class akan menampung beberapa student dibawah ini 
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		//Aggregation
		student1.setPhone(contact1); 
		student2.setPhone(contact2);
		student3.setPhone(contact3);
		

		
		
		//pengaturan Major ke student1 --> composition
		student1.setMajor(major1);
		student2.setMajor(major1);
		student3.setMajor(major1);
		
		//--> Dependency 
		Adviser adviser1 = new Adviser("Priyanto Hidayatullah, ST., M.Sc");
		Adviser adviser2 = new Adviser("Akhmad Bakhrun, S.Kom., M.T");
		
		
		
		

		
		//Implementasi menggunakan --> composition 

		
		//Association
		System.out.println("Students List Class 1A");
		for(Students mahasiswa : Class1.getStudentlist()) {
			System.out.println("Name     : "+ mahasiswa.getName());	
		}
		
		
		
		int a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Name              : " + student1.getName());
		System.out.println("Contact : ");
		for(Contact contact : contact1) {
			
			System.out.println("["+a+"]"+contact.getPhone());
			a++;
		}
		System.out.println("Class             : " + student1.getNameClass().getClassName());
		System.out.println("Major             : " + student1.getMajor().getMajorName());
		System.out.println("Program           : " + student1.getMajor().getProgram().getProgramName());
		student1.Adviser(adviser1);
		
		
		a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Name              : " + student2.getName());
		System.out.println("Contact : ");
		for(Contact contact : contact2) {
			
			System.out.println("["+a+"]"+contact.getPhone());
			a++;
		}
		System.out.println("Class             : " + student2.getNameClass().getClassName());
		System.out.println("Major             : " + student2.getMajor().getMajorName());
		System.out.println("Program           : " + student2.getMajor().getProgram().getProgramName());
		student1.Adviser(adviser1);
	
		
		a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Name              : " + student3.getName());
		System.out.println("Contact  : ");
		for(Contact contact : contact3) {
			
			System.out.println("["+a+"]"+contact.getPhone());
			a++;
		}
		System.out.println("Class             : " + student3.getNameClass().getClassName());
		System.out.println("Major             : " + student3.getMajor().getMajorName());
		System.out.println("Program           : " + student3.getMajor().getProgram().getProgramName());
		student1.Adviser(adviser1);
		
	}

}
