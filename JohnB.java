public static String getIntBitString(int i) {
    String binary = "0";
    //establish first character because I could not initialize "binary" with an
int
    int first = i & 1;
    if (first == 1) {
        binary = "1";
    }
    //for characters 1-31, find 1 or 0 and add to the front of the updating 
string
    for (int x = 1; x < 32; x++) {
        int bit = 1 & (i>>>x);
        binary = bit+binary;
    }
    return binary;
}
