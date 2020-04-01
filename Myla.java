public static String getIntBitString(int x) {
    String bitString = "";
    for (int i = 31; i >= 0; i--) { 
        int bit = x >> i; 
        if ((bit & 1) > 0) 
            bitString += "1";
        else
            bitString += "0";
    } 
    return bitString;
}
