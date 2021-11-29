public class Exercise1 {

    public static boolean isContain(String str1, String str2) {
        if (str1.length()<str2.length())
            return false;
        else {

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(0)) {
                    boolean flag = true;
                    for (int j1=i, j2=0; j2<str2.length(); j1++,j2++) {
                        if (str1.charAt(j1) != str2.charAt(j2))
                            flag = false;
                    }
                    if (flag)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "I like eating apples";
        String str2 = "I like eating apples";
        System.out.println(isContain(str1,str2));
    }
}
