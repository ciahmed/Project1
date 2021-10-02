package nonprimitive;

public class MyString {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 3;
		
		String num1 = "1";
		String num2 = "3";
		
		String name1 = "John";
		String name2 = "Doe";
		
		System.out.println(x+y);
		
		//String concatenation 
		System.out.println(num1+num2);
		
		System.out.println(x+num1);
		
		System.out.println(name1+" "+name2);
		
		System.out.println(name1+num1);
		
		//String manipulation 
		String str = "I am starting selenium course";
		
		System.out.println(str.length());
		System.out.println(str.charAt(26));
		System.out.println(str.indexOf("s"));
		
		String str2 = "I am starting selenium java";
		System.out.println(str.equals(str2));
		
		String word = " Hello team ";
		System.out.println(word.trim());
		
		String hello = "hello word how are you";
		String words[] = hello.split(" ");
		System.out.println(words[4]);
		
		System.out.println(hello.replace("word", "team"));
		
		
		
		
		
		
	}
}
