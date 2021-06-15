public class ExcelSheetColumnTitleFromString {
    public static int convertToTitle(String columnNumber){
        int res = 0;
        int length = columnNumber.length();

        for(int i = 0; i < length; i++){
            res = res * 26 + (columnNumber.charAt(i) - 'A' + 1);
            System.out.println(columnNumber.charAt(i) - 'A');
        }

        return res;
    }

    public static void main(String[] args) {
        int ret = convertToTitle("AA");
    }
}
