    public static String getIntBitString(int x){
        String s = "";
        int y = 1;
        int place = 1;
        for(int i=0; i<32 ; i++){
            if ((place & x) == 0){
                s = "0" + s;
            }
            else{
                s = "1" + s;
            }
            place = place << 1;
        }
        return s;
    }
