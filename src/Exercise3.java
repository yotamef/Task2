public class Exercise3 {

    public static String subString(String str, int start, int end) {
        String toReturn = "";
        for (int i=start; i<=end; i++) {
            toReturn = toReturn + str.charAt(i);
        }
        return toReturn;
    }

    public static boolean equals(String str1, String str2) {
        if (str1.length() == str2.length()) {
            boolean flag = true;
            for (int i=0; i<str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i))
                    flag = false;
            }
            return flag;
        }
        else {
            return false;
        }
    }

    public static boolean isGoodNumber (String str){
        boolean check = true;
        for (int i=0; i<str.length(); i++) {
            int charAt = str.charAt(i);
            if (i==3) {
                if (!(charAt>47 && charAt<58 || charAt==45))
                    check = false;
            }
            else if(charAt<48 || charAt>57)
                check = false;
        }
        return check;
    }
    public static String onlyNumbers(String str) {
        String numbers = "";
        for (int i=0; i<str.length(); i++) {
            int charAt = str.charAt(i);
            if (charAt>47 && charAt<58)
                numbers = numbers+str.charAt(i);
        }
        return numbers;
    }

    public static String phoneNumber(String phoneNumber) {
        if (isGoodNumber(phoneNumber)) {
            String onlyNumbers = onlyNumbers(phoneNumber);

            String start1 = subString(onlyNumbers, 0, 1);
            String start2 = subString(onlyNumbers, 0, 3);
            String startToReturn = "";
            String endToReturn = "";
            if (equals(start1, "05") && onlyNumbers.length() == 10) {
                startToReturn = subString(onlyNumbers, 0, 2);
                endToReturn = subString(onlyNumbers, 3, onlyNumbers.length() - 1);
            } else if (equals(start2, "9725") && onlyNumbers.length() == 12) {
                startToReturn = 0 + subString(onlyNumbers, 3, 4);
                endToReturn = subString(onlyNumbers, 5, onlyNumbers.length() - 1);
            } else {
                return "";
            }
            return startToReturn + "-" + endToReturn;
        }
        else {
            return "";
        }

    }

    public static void main(String[] args) {

        String str = "972569041476";
        System.out.println(phoneNumber(str));

    }
}
