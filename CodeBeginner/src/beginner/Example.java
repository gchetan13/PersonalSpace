package beginner;

public class Example {

	public static void main(String[] args) {
		String s="abc";
		char[] chars = new char[3];
	

		chars[s.charAt(0)-'a']='x';
		chars[s.charAt(1)-'a']='y';
		chars[s.charAt(2)-'a']='z';
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}

}
