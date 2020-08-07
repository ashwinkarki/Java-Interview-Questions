public class Main {

    public static void main(String[] args) {
    	
    	String literal="hello";
    	String obj=new String("hello");
    	String otherLiteral="hello";
    	String newLiteral=new String("hello");
    	
    	System.out.println(literal==otherLiteral);
    	System.out.println(obj==otherLiteral);
    	System.out.println(literal.equals(obj));
    	System.out.print(newLiteral.equals(obj));
    	System.out.println();
    	System.out.println(countVowels("Ashwin"));
    }
    
    
    public static int countVowels(String s) {
    	String c="vowels";
    	int count=0;
    	s=s.toUpperCase();
    	for(int i=0;i<s.length();i++) {
    		c.contains(Character.toString(s.charAt(i)));
    			char  a=s.charAt(i);
    	if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
    		count+=1;
    	}
    		
    	}
    	return count;
    }
}
