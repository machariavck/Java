import java.util.Scanner;

public class PersonalInformationProgram {
	public static void main(String[] alpha) {
		PersonalInformation person1 = new PersonalInformation();
		PersonalInformation person2 = new PersonalInformation();
		PersonalInformation person3 = new PersonalInformation();
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String s = sc.nextLine();
		person1.setName(s);
		System.out.println("What's your home address?");
		s = sc.nextLine();
		person1.setAddress(s);
		System.out.println("What's your age?");
		int t = sc.nextInt();
		person1.setAge(t);
		System.out.println("What's your phone number?");
		t = sc.nextInt();
		person1.setPhoneNumber(t);
		sc.nextLine();
		System.out.println("\nProvide information for two more people...");
		sc.nextLine();
		System.out.println("What's the second person's name?");
		s = sc.nextLine();
		person2.setName(s);
		System.out.println("What's the second person's home address?");
		s = sc.nextLine();
		person2.setAddress(s);
		System.out.println("What's the second person's age?");
		t = sc.nextInt();
		person2.setAge(t);
		System.out.println("What's the second person's phone number?");
		t = sc.nextInt();
		person2.setPhoneNumber(t);
		sc.nextLine();
		System.out.println("\nProvide information now for one more folk now..");
		sc.nextLine();
		System.out.println("What's the third person's name?");
		s = sc.nextLine();
		person3.setName(s);
		System.out.println("What's the third person's home address?");
		s = sc.nextLine();
		person3.setAddress(s);
		System.out.println("What's the third person's age?");
		t = sc.nextInt();
		person3.setAge(t);
		System.out.println("What's the third person's phone number?");
		t = sc.nextInt();
		person3.setPhoneNumber(t);
		System.out.println("\n\nName: " + person1.getName() + "\nHome Address: " +
							person1.getAddress() + "\nAge: " + person1.getAge() + "\nPhone Number: " +
							person1.getPhoneNumber());
		System.out.println("\n\nName: " + person2.getName() + "\nHome Address: " +
							person2.getAddress() + "\nAge: " + person2.getAge() + "\nPhone Number: " +
							person2.getPhoneNumber());
		System.out.println("\n\nName: " + person3.getName() + "\nHome Address: " +
							person3.getAddress() + "\nAge: " + person3.getAge() + "\nPhone Number: " +
							person3.getPhoneNumber());
		System.out.println("\n\nNice work lad");
		
	}
}
