import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> deckOfCards = new Stack();
        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";
        
        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);
        
        
        String top=deckOfCards.peek();
        
        System.out.println(top);
        System.out.println(deckOfCards.size());
        
        while(!deckOfCards.empty()) {
        	String toBeremoved=deckOfCards.pop();
        	
        	System.out.println(toBeremoved);
        }
        
    }
}
