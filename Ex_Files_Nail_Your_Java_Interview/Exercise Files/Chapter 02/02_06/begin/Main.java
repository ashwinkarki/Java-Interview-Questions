public class Main {

    public static void main(String[] args) {
    	
    	String firstName="ashwin";
    	String lastName="karki";
    	
    	String name=firstName+" "+lastName;
    	
    	String concatName=firstName.concat(lastName);
    	
    	StringBuilder stringBuilder=new StringBuilder("abc");
    	stringBuilder.append("def");
    	stringBuilder.append("ghi");
    	stringBuilder.append("jkl");
    	stringBuilder.append("mno");
    	stringBuilder.insert(9,"APHA");
    	stringBuilder.delete(1,3);
    	
    	String a=stringBuilder.toString();
    	System.out.println(a);

    }
}
