import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	  public static final String regularExpression = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
	  private static Pattern pattern = Pattern.compile(regularExpression) ;
	  public static boolean validUser(String usrName) {
		 
		  Matcher match =  pattern.matcher(usrName);
		if(match.matches()) {
			return true;
		}
		else {
			return false;
		}
		
		  
	  }
	  
	  public static void main(String[] args) {
		  
		  System.out.println("Is 'java2novice' a valid user name? "
                  +validUser("8va26666"));
		
	}
	
	
		
	
	
}
