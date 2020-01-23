package com.capgemini.forestrymanagementsystemjdbc.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	public static int isNumber2(String s) {
		try {
			int t = Integer.parseInt(s);
			return t;
		} catch (Exception e) {
			return 0;
		}
	}
	public static boolean isStringOnly(String str) 
    { 
		
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z' ']*$")&&(str.length()>2))); 
    }
	public static boolean isString(String str) 
    { 
		
        return ((str.matches("[a-zA-Z]"))); 
    }
	public static boolean isValid(String email) 
    {  
        String emailRegex = "^[a-z0-9_+&*-]+(?:\\."+ 
                            "[a-z0-9_+&*-]+)*@" + 
                            "(?:[a-z0-9-]+\\.)+[a-z" + 
                            "]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	

	public static boolean isNumber(String s) {
		try {
			int t = Integer.parseInt(s);
			if(t>0) {
			return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}

	}
	
	
	
	public static boolean isValidTel(String s) 
    { 
        // The given argument to compile() method  
        // is regular expression. With the help of  
        // regular expression we can validate mobile 
        // number.  
        // 1) Begins with 0 or 91 
        // 2) Then contains 7 or 8 or 9. 
        // 3) Then contains 9 digits 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
  
        // Pattern class contains matcher() method 
        // to find matching between given number  
        // and regular expression 
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    }
	
	 public static int calculatePasswordStrength(String password){
	        
	        //total score of password
	        int iPasswordScore = 0;
	        
	        if( password.length() < 8 )
	            return 0;
	        else if( password.length() >= 6 )
	            iPasswordScore += 2;
	        else 
	            iPasswordScore += 1;
	        
	        //if it contains one digit, add 2 to total score
	        if( password.matches("(?=.*[0-9]).*") )
	            iPasswordScore += 2;
	        
	        //if it contains one lower case letter, add 2 to total score
	        if( password.matches("(?=.*[a-z]).*") )
	            iPasswordScore += 2;
	        
	        //if it contains one upper case letter, add 2 to total score
	        if( password.matches("(?=.*[A-Z]).*") )
	            iPasswordScore += 2;    
	        
	        //if it contains one special character, add 2 to total score
	        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
	            iPasswordScore += 2;
	        
	        return iPasswordScore;
	        
	    }
	 public static boolean isDay(String day) {
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")
				||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday")||day.equalsIgnoreCase("Saturday")||
				day.equalsIgnoreCase("Sunday")) {
			return true;
		}
		return false;
	 }
	 public static boolean isValidDate1(String d) {
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			simple.setLenient(false);
			try {
				Date date = simple.parse(d); //if date invalid throw exception
				Date todayDate = new Date();
				return date.before(todayDate); //return false if future date
				} catch (Exception e) {
					return true;
				}
		}
	 public static boolean isName(String str) {
		 if(str.length()>=3) {
			 return ((str != null) 
		                && (!str.equals("")) 
		                && (str.matches("^[a-zA-Z]*$"))); 
		 }
			 return false;
	 }
	 public static boolean isNumber1(String s) {
			try {
				double t = Double.parseDouble(s);
				if(t>0) {
				return true;
				}
				return false;
			} catch (Exception e) {
				return false;
			}

		}
}
