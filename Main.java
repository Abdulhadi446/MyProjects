public class Main{

    static int i = 0;
    public static void main(String[] args) {
        String[] names = {"junaid", "anum","jimmi","jarhon"};
        char[] a = {'j'};
        find(names, a);
    }

    public static void find(String[] names, char[] a) {
        int c = 0;

        if (i >= names.length) {
            return;
        }

        for (int j = 0; j < a.length; j++) {
            if (names[i].length() >= a.length) {
                if (names[i].toLowerCase().charAt(j) == a[j]) {
                    c++;
                }
            }
        }

        if (c == a.length) {
            System.out.println(names[i]);
        }
        i++;
        find(names, a);
    }
}