public class STRGFSTRGV {
    public static String replace(String source, String search, String replace) {
        int pos = source.indexOf(search);
        if (pos == -1) {
            return "Didn't found '" + search + "' in '" + source + "'. Nothing to replace!";
        } else {
            String result = source.substring(0, pos) + replace + source.substring(pos + search.length(), source.length());
            if (result.indexOf(search) == -1) {
                return result;
            } else {
                result = replace(result, search, replace);
                return result;
            }
        }
    }

    public static void main(String[] args) {

    }
}
