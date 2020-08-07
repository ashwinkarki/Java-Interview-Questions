import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Create a Linked List
        LinkedList<String> students = new LinkedList<>();

        // Add students to Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");
        
        students.addFirst("Ashwin");
        students.addLast("karki");
        students.add(2,"Bhawana");
        
        String firstStudent=students.getFirst();
        System.out.println("First "+firstStudent);
        
        String lastStudent=students.getLast();
        System.out.println("Last "+lastStudent);
        
        System.out.println(students.size());
        
        System.out.println(students);
        
        String secondStudent=students.get(1);
        System.out.println("Second "+secondStudent);
        
       int i= students.indexOf("Morgan");
       System.out.println("index of Morgan"+i);
       
       students.removeFirst();
       students.removeLast();
       students.remove("Ashwin");
       students.remove(0);
       
       System.out.println(students);
       
       boolean result=students.contains("Taylor");
       
       students.clear();
       
       System.out.println(students);
       
        
        
    }
}
