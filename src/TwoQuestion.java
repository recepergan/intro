import java.util.Locale;

public class TwoQuestion {
    public static void main(String[] args) {
        System.out.println(isAnagram("enerjik","jenerik"));
    }

    public static boolean isAnagram(String s1, String s2) {

        String k = s1.toLowerCase();
        String l = s2.toLowerCase();

        if (k.length() != l.length()) {
            return false;
        }

        String delStr = "";
        String newStr = s2;


        for (int i = 0; i < k.length(); i++) {
            for (int j = 0; j < l.length(); j++) {

                if (k.charAt(i) == l.charAt(j)) {
                    delStr = k.substring(i,i + 1);
                    newStr = newStr.replaceFirst(delStr,"");
                }
            }
        }

        if(newStr.equals("")) {
            return true;
        }else {
            return false;
        }

    }
}
