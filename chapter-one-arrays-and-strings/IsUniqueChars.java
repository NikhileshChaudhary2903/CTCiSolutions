import java.util.Arrays;

public class IsUniqueChars {

	public static boolean isUniqueChars(String str) {

		// 32 bit number
		int checker=0;
		
		for(int i=0;i<str.length();i++) {
			
			int ch=str.charAt(i)-'a';
			
			// check if ch is set
			if( (checker & (1 >> ch) ) > 0 )
			return false;
			
			// set the bit
			checker= checker | (1>>ch);
		}
		
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUniqueChars("abfa"));

	}

}
