package introduction;

public class StringPractice {

	public static void main(String[] args) {
		String text1 = new String("Hello World");
		String text2 = "Hello World";// same as above
		
		//ALL objects get prepared using the ".equals" method
		if(text1.equals(text2)){
			print("These strings are equal: ");
		}
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
		
	}
	
	public static void print(String m){
		System.out.println(m);
	}

}
