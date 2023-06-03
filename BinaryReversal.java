/**
 * @author tatek on 6/1/2023
 */
public class BinaryReversal {

    public static StringBuffer binaryPadding(String str) {

        StringBuffer paddedBinary = new StringBuffer ();
//        Integer originalDecimal = Integer.parseInt (str);
        Integer bitPadding = Integer.parseInt (str);

        //padding the binary in to 8 bites
        if (bitPadding <= 255)
            for (int i = decimalToBinary(str).length(); i < 8; i++) {
            paddedBinary.append(0);
        }

        //padding 16 bites
        if (bitPadding >255 && bitPadding <= 65535)
            for (int i = decimalToBinary(str).length(); i < 16; i++) {
            paddedBinary.append(0);
        }
        // for future expansion
        //padding 32 bites
        //padding 64 bites

        return paddedBinary;
    }

    public static StringBuffer decimalToBinary(String str){
        Integer remander;
        StringBuffer binary = new StringBuffer ();

        Integer originalDecimal = Integer.parseInt (str);
        //collecting binary values
        while (originalDecimal != 0){
            remander = originalDecimal%2;
            originalDecimal = originalDecimal/2;
            binary.append (remander);
        }

        return binary.reverse();
    }

    //Binary to decimal
    public static StringBuffer binaryToDecimal(String paddedBinary){
        double decimal = 0;
        Integer remander;
        String highestPower = paddedBinary.toString ();//in order to the highest power

        for (int i = 0; i < highestPower.length (); i++) {
            remander = Integer.parseInt (highestPower.substring (i,i+1));
            decimal += ((remander * Math.pow (2, ((highestPower.length ()-1) - i))));
        }
        int value = (int)decimal;//will change 244.0 -> 244

        String reversedDecimal = String.valueOf (value);//changing to fit return compatibility
        StringBuffer stringBuffer = new StringBuffer(reversedDecimal);

        return stringBuffer;
    }

}
