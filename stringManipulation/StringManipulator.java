public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }
    public Integer getIndexOrNull(String str, String str2){
        int index = str.indexOf(str2);
        if (index == -1){
            return null;
        }
        return index;
    }
    public Integer getIndexOrNull(String str, char c){
        int index = str.indexOf(c);
        if (index == -1){
            return null;
        }
        return index;
    }
    public String concatSubstring(String str1, int start, int end, String str2){
        String strSub1 = str1.substring(start, end);
        return strSub1 + str1;

    }
}