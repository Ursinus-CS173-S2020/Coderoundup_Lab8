    public static String getIntBitString(int x){
        String s = "";
        int Alpha = 1;
        for (int i = 0; i < 32; i++) {
            if((Alpha & x) != 0){
                s = "1" + s;
            }
            if((Alpha & x) == 0){
                s = "0" + s;
            }
            Alpha = 2 << i;
        }
        return s;
    }
    p
