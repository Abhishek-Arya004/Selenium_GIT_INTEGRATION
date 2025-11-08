package JavaAssignment1;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'e';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U') {
		System.out.println(ch + " is a vowel.");
	}
	else if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')) {
	System.out.println(ch + " is a consonant.");}
	else {
        System.out.println("Invalid input! Please enter an alphabet.");

	}
	}		

}
