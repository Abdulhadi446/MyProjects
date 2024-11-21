public class numarical {
    public static void main(String[] args) {
        numaricals(100, 0, 1);
    }

    public static void numaricals(int ends, int back, int pass2) {
        if (pass2 == ends) {
            return;
        }
        System.out.println(back+" + "+pass2+": "+(back+pass2));
        numaricals(ends,pass2, pass2 + 1);
    }
}
