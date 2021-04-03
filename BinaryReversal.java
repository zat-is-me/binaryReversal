//Author Tatek Ahmed
public class BinaryReversal {
    public static void main(String[] args) {
        String decimal = String.valueOf (47);
        System.out.println (binaryReversal (decimal));
    }
    private static String binaryReversal(String str) {
        double binary = 0;
        Integer bit;
        Integer baseValue = Integer.parseInt (str);
        Integer bitPadding = Integer.parseInt (str);
        StringBuffer stringBuffer = new StringBuffer ();
        String tempStr;

        //Decimal to binary
        while (baseValue != 0){
            bit = baseValue%2;
            baseValue = baseValue/2;
            stringBuffer.append (bit);
        }

        //padding 8 bites
        if (bitPadding <= 255){
            for (int i = stringBuffer.length () ; i < 8; i++) {
                stringBuffer.append (0);
            }
        }
        //padding 16 bites
        if (bitPadding >255 && bitPadding <= 65535){
            for (int i = stringBuffer.length () ; i < 16; i++) {
                stringBuffer.append (0);
            }
        }
        // for future expansion
        //padding 32 bites
        //padding 64 bites

        //Binary to decimal
        tempStr = stringBuffer.toString ();
        for (int i = 0; i < tempStr.length (); i++) {
            bit = Integer.parseInt (tempStr.substring (i,i+1));
            binary += ((bit * Math.pow (2, ((tempStr.length ()-1) - i))));
        }

        int value = (int)binary;//will change 244.0 -> 244
        String myS = String.valueOf (value);//changing to fit return compatibility

        return myS;
    }
    //Have the function BinaryReversal(str) take the str parameter being passed,
//    which will be a positive integer, take its binary representation (padded to the nearest N * 8 bits)
//    , reverse that string of bits, and then finally return the new reversed string in decimal form.
//    For example: if str is &quot;47&quot; then the binary version of this integer is 101111
//    but we pad it to be 00101111. Your program should reverse this binary
//        string which then becomes: 11110100 and then finally return the decimal version of this string,
//        which is 244.
}