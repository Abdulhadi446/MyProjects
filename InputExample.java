public class InputExample {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.print("Enter a line of text: ");
            StringBuilder input = new StringBuilder();
            int character;
            int num = (int) (Math.random() * 10) + 1;
            // int num = 0;
            // Read input character by character
            while ((character = System.in.read()) != '\n') {  // '\n' is the newline character
                input.append((char) character);
            }
            int userInput = Integer.parseInt(input.toString().trim());
            if(userInput == num) {
                System.out.println("The random number is: "+num);
                System.out.println("You win!");
                break;
            } else{
                System.out.println("The random number is: "+num);
                System.out.println("You lose.");
            }
        }
    }
}
