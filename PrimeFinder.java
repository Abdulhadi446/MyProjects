public class PrimeFinder {
    public static void main(String[] args) {
        printPrime(10);
    }   

    public static void printPrime(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is Not Prime.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) { // 0,1 are and less are not prime
            return false;
        }

        else if (num == 2) { //2 is a prime num
            return true;
        }

        else if (num % 2 == 0){ //even num's cant prime num's
            return false;
        }

        if (num == 3) {
            return true;
        }

        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        

        return true;
    }
}