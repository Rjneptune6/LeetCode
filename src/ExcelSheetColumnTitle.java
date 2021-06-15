public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber > 0){
            result = (char)('A'+(--columnNumber)%26) + result;
            columnNumber /= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        String res = convertToTitle(27);
        System.out.println(res);
    }
}
