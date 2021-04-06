//Author Tatek Ahmed
public class BinaryReversal {
    public static void main(String[] args) {
        String decimal = String.valueOf (47);
        System.out.println (binaryReversal (decimal));                              // Output
    }
    private static String binaryReversal(String str) {
        double decimal = 0;
        Integer bit;
        Integer originalDecimal = Integer.parseInt (str);
        Integer bitPadding = Integer.parseInt (str);
        StringBuffer originalBinary = new StringBuffer ();
        String highestPower;

        //Decimal to binary
        while (originalDecimal != 0){
            bit = originalDecimal%2;
            originalDecimal = originalDecimal/2;
            originalBinary.append (bit);
        }

        //padding 8 bites
        if (bitPadding <= 255){
            for (int i = originalBinary.length () ; i < 8; i++) {
                originalBinary.append (0);
            }
        }
        //padding 16 bites
        if (bitPadding >255 && bitPadding <= 65535){
            for (int i = originalBinary.length () ; i < 16; i++) {
                originalBinary.append (0);
            }
        }
        // for future expansion
        //padding 32 bites
        //padding 64 bites

        //Binary to decimal
        highestPower = originalBinary.toString ();//inorder to the highest power
        for (int i = 0; i < highestPower.length (); i++) {
            bit = Integer.parseInt (highestPower.substring (i,i+1));
            decimal += ((bit * Math.pow (2, ((highestPower.length ()-1) - i))));
        }

        int value = (int)decimal;//will change 244.0 -> 244
        String reverseDecimal = String.valueOf (value);//changing to fit return compatibility

        return reverseDecimal;
    }
}