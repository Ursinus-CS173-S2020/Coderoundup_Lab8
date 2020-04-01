public static String getIntBitStringJava(int x) 
{
    String s="";
    for (int i = 1; i <= 32; i++) 
    {
        int bit= x&1;
        s=bit+s;
        x=x>>>1;
    }
    return String.format("%32s",s);
}
