public static String getIntBitString(int x) {
    String p = "" ;
    int y = 1;
    int place = 1;
    for (int i=0; i<32 ; i++) {
        if ((place & x) ==0) {
            p = "0" + p ;
        }
        else {
            p = "1" + p;
        }
        place = place << 1;
    }
    return p ;
}
