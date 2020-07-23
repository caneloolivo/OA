package Training;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<=r){
            char lchar = s.charAt(l);
            char rchar = s.charAt(r);
            if(Character.isLetterOrDigit(lchar) && Character.isLetterOrDigit(rchar)) {
            	if(Character.toLowerCase(lchar) != Character.toLowerCase(rchar))
            		return false;
            	l++;
            	r--;
            }
            else if(!Character.isLetterOrDigit(lchar))
            	l++;
            else if(!Character.isLetterOrDigit(rchar))
            	r--;
        }            
        return true;
	}
}
