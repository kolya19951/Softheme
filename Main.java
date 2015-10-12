public class Main {
    public static void main(String[] args) {
        String text = "11111110110011111100001111111";
        int tmp = 0;
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '1') {
                tmp++;
                if (tmp > max)
                    max = tmp;
            }
            else{
                tmp = 0;
            }
        }
        System.out.println(max);
    }
}
