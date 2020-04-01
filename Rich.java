public static String getIntBitString(int x) {
    String s = "";
    int digit =1;
    for (int i=0; i <32; i++){
        if ((digit & x) ==0){
            s = "0" +s;
        }
        else {
            s = "1" +s;
        }
        digit = digit <<1;
    }
    return s;
}
