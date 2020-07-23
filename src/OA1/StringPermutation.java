package OA1;

public class StringPermutation {
	public boolean rotateString(String A, String B) {
        if(A.equals(B))
			return true;
        else if(A.equals("") || B.equals(""))
			return false;
        StringBuilder newA = new StringBuilder(A);
        boolean result = false;
        for(int i = 0; i < A.length(); i++) {
            if(newA.charAt(0) == B.charAt(0)){               
                if(newA.toString().equals(B)){
                    result = true;
                    break;
                }
            }
            char last = newA.charAt(0);
            newA.deleteCharAt(0);
            newA.append(last);
        }            
        return result;
    }
	
	public static void main(String[] args) {
		StringPermutation solution = new StringPermutation();
		String A = "abcde", B = "cdeab";
		boolean result = solution.rotateString(A, B);
		System.out.println("Es rotación?" + result);
	}
}
