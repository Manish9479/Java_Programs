public class student {
	private String rollNo;
	private String name;
	private String DoB;
	private int age;

	public void Study() {
		System.out.println("I am doing my Study.");
	}

	public void Exam() {
		System.out.println("My Mid-Term is coming..");
	}

	public boolean Study(String Subject) {
		System.out.println("I am learning " + Subject);
		return true;
	}

	public void displyInfo() {
		System.out.print("Roll Number\t" + rollNo);
		System.out.print("\n Name: \t" + name);
		System.out.print("\nDoB: \t" + DoB);
		System.out.print("\nAge: \t" + age);
	}

	public static void main(String args[]) {
		student Std_detail = new student();
		Std_detail.Study();
		Std_detail.Exam();
		System.out.println(Std_detail.Study("OOAD"));

		Std_detail.rollNo = "S10026";
		Std_detail.name = "John";
		Std_detail.DoB = "22/06/2000";
		Std_detail.age = 22;

		Std_detail.displyInfo();
	}
}
