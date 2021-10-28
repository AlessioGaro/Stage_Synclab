
public class RandomString {
		  
	    static String getString(int n)
	    {
	  
	       
	        String stringa = "abcdefghijklmnopqrstuvxyz";
	  
	       
	        StringBuilder sb = new StringBuilder(n);
	  
	        for (int i = 0; i < n; i++) {
	  
	            int index  = (int)(stringa.length() * Math.random());
	  
	           
	            sb.append(stringa.charAt(index));
	        }
	  
	        return sb.toString();
}
}
