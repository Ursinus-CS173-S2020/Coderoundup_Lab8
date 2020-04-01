    public static String getIntBitString(int x) {
        String answer = "";
        int count = 0;
        do{   
            int temp = x & 1;
            answer = answer + temp;
            x = x >>> 1;
            count++;
        } while (x > 0);
        do{
            answer = "0" + answer;
        }while (answer.length() < 32);
        return answer;
    }
