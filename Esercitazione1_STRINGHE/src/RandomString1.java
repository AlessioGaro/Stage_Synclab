
public class RandomString1 {
	
	 static String getString(int n)
	    {
	  
	       
	        String stringa = "abcdefghijklmnopqrstuvxyz" + "ABCDEFGHIJKLMNOPQRSTUVXYZ";
	  
	       
	        StringBuilder sb = new StringBuilder(n);
	  
	        for (int i = 0; i < n; i++) {
	  
	            int index  = (int)(stringa.length() * Math.random());
	  
	           
	            sb.append(stringa.charAt(index));
	        }
	  
	        return sb.toString();
}

}
