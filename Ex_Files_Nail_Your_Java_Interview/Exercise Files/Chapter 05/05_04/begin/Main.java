public class Main {
    public static void main(String[] args) {
//    		Pig p=new Pig();
//    		System.out.println(p.sound());
//    		
    		Animal a=new Cow();
    		System.out.println(a.sound());
    		
    		Operation o=new Operation();
    		System.out.println(o.add(1, 2));
    		System.out.println(o.add(1, 2, 3));
    		System.out.println(o.add(1, 3, 4, 5));
    }
}