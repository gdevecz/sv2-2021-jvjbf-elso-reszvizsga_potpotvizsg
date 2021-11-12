package arrayopoeration;

public class ArrayOperation {

    public String getWordsBackwards(String[] words) {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (int i = words.length - 1; i >= 0; i--) {
            if (first) {
                first = false;
            } else {
                result.append(", ");
            }
            result.append(words[i]);
        }
        return result.toString();
    }
}
