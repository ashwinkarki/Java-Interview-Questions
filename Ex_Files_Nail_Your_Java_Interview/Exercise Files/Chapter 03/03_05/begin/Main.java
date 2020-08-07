public class Main {

    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";
        
        String fisText=text.replace("bamboo","fish");
        System.out.println(fisText);
        
       //How many sentences?
        String[] sentences=text.split("\\.");
        System.out.println("THe text has" +sentences.length+"sentence");
        
        String[] words=text.split(" ");
        System.out.println("the text has"+words.length+"words");
        
        System.out.println(text.length());
        
//        THe text has4sentence
//        the text has53words
//        297

    }
}
