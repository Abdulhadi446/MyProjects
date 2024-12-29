public class PrintHeart {//heart "██"
    public static void main(String[] args) {
        //first way
        System.out.println("  ████    ████  ");//██
        System.out.println("██    ████    ██");
        System.out.println("██            ██");
        System.out.println("  ██        ██  ");
        System.out.println("    ██    ██    ");
        System.out.println("      ████       ");
        System.out.println();
        //Second way
        System.out.println("  ████    ████  \n██    ████    ██\n██            ██\n  ██        ██  \n    ██    ██    \n      ████       \n");
        //third way
        System.out.println("  ████    ████  \n██    ████    ██");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print("██");
            for (int j = 0; j < 2 * (3 - i); j++) { // Adjust space logic
                System.out.print("  ");
            }
            System.out.println("██");
        }
    }   
}

/*

  [][]    [][]  
[]    [][]    []
[]            []
  []        []  
    []    []    
      [][]       

 */