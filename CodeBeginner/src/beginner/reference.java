package beginner;

public class reference {
public static void change(String name,int i,Student s){
	name = "Chetan";
	i=11;
	s.setName("Aman");
	s.setRollNum(220);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Jagat";
		String s2 = s;
		s = "Chetan";
		System.out.println(s + " " +s2);
		int i=10;
		Student student = new Student();
		student.setName("Ankita");
		student.setRollNum(110);
		change(s,i,student);
		System.out.println(s+" "+i+" "+student.getName()+" "+student.getRollNum());
	}

}
