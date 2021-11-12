package everysecond;

public class EverySecond {
    public String getEverySecondLetter(String s) {
        StringBuilder sb = new StringBuilder(s.length() / 2);

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
