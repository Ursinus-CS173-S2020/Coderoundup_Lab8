    public static String getIntBitString(int x){
        String bit = "";
        int y = x;
        for (int place = 1; place <= 32; place++){ 
            int z = (int)Math.pow(2, place);
            if (y%z == 0){
                bit = "0" + bit;
            }
            else {
                bit = "1" + bit;
                y = y - y%z;
            }
        }
        return bit;
    }
