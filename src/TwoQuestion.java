public class TwoQuestion {
    public static void main(String[] args) {
        System.out.println(isAnagram("enerjik","jenerik"));
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String delStr = "";
        String newStr = s2;


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    delStr = s1.substring(i,i + 1);
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
