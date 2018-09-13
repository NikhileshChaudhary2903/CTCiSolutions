
public class Permutation {
	public boolean permutation(String s, String t) {
		
		if(s.length()!=t.length())
			return false;
		
		int flag[]=new int[128];
		
		for(int i=0;i<s.length();i++) {
			flag[s.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(flag));
		for(int i=0;i<t.length();i++) {
			flag[t.charAt(i)-'a']--;
			
			if(flag[t.charAt(i)-'a']<0)
				return false;
			
		}
	
		return true;
	}
}
©
