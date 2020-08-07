public class Main {

	public static String reverseString(String s) {
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(stringBuilder.append(s.charAt(i)));
		}
		return stringBuilder.toString();
	}
	
	
    public static void main(String[] args) {
        String p = "   Panda";
        String f = " Fish ";
        String h = "Horse     ";
        String c = " Cat";
       // String nothing = " ";
        String[] strings = {p, f, c, h};
        
        
        for(String s:strings) {
        	System.out.println(s);
        	s=s.trim();
        	System.out.println(s);
        	
        	if(!s.isEmpty()) {
        		System.out.println("Not empty"+" "+s);
        	}
        	
        	if(s.length()>3) {
        		System.out.println("More than 3"+s);
        	}
        	
        	if(s.length()>=3) {
        		System.out.println("more than or equal to 3"+s);
        	}
        	
        	System.out.println(s.toLowerCase());
        	System.out.println(s.toUpperCase());
        	
        	int index=1;
        	System.out.println(s.charAt(index));
        	
        	char[] charArray=s.toCharArray();
        	System.out.println("char at index "+index+":"+charArray[index]);
        	
        	int indexOfE=s.indexOf("e");
        	System.out.println("Index of e is "+indexOfE);
        	
        	s=s.toLowerCase();
        	if(s.contains("app")) {
        		System.out.print("Contains app:"+s);
        	}
        	
        	//System.out.print(s.substring(1,4));
        	System.out.println(reverseString(s));
        	
        	System.out.println();
        }
        
    }
}
