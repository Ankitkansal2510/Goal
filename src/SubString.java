public class SubString {
    public static void main(String[] args) {
        String s = "Hel";
        printSubString(s);
    }

    private static void printSubString(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char[] temp = new char[n];
            int startIndex = 0;
            for (int j = i; j < n; j++) {
                temp[startIndex++] = s.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
