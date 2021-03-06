import java.util.Arrays;

public class Main {


    public static boolean isItemInArray(String item, String[] items) {
        for (String i : items) {
            if (i.toLowerCase().equals(item)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        // Declare an Array
        int[] nums;

        // Declare and allocate an Array
        double[] otherNums = new double[5];
        
        
        // Declaring, allocating, and initializing an array
        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};
        
        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
        
        
        int indexOffish=2;
        int indexcOfBird=0;
        
        String getFish=availablePets[indexOffish];
        String getBird=unavailablePets[indexcOfBird];
        
        availablePets[indexOffish]=getBird;
        unavailablePets[indexcOfBird]=getFish;
        
        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
        
        

    }
}
