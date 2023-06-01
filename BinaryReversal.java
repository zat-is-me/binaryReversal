/**
 * @author tatek on 6/1/2023
 */
public class BinaryReversal {
    public static String binaryReversal(String str) {
        double decimal = 0;
        Integer remander;
        Integer originalDecimal = Integer.parseInt (str);
        Integer bitPadding = Integer.parseInt (str);
        StringBuffer binary = new StringBuffer ();
        StringBuffer paddedBinary = new StringBuffer ();
        String highestPower;

        //collecting binary values
        while (originalDecimal != 0){
            remander = originalDecimal%2;
            originalDecimal = originalDecimal/2;
            binary.append (remander);
        }
        //At this stage the decimal is changed to binary
        binary.reverse();

        //padding the binary in to 8 bites
        if (bitPadding <= 255){
            for (int i = binary.length () ; i < 8; i++) {
                paddedBinary.append (0);
            }
        }

        //padding 16 bites
        if (bitPadding >255 && bitPadding <= 65535){
            for (int i = binary.length () ; i < 16; i++) {
                paddedBinary.append (0);
            }
        }
        // for future expansion
        //padding 32 bites
        //padding 64 bites

        paddedBinary.append(binary);
        System.out.println("The binary form of: "+str+" in "+paddedBinary.length()+" is: "+paddedBinary);

        //The padded revers binary will be
        System.out.print("The reverse binary of: "+paddedBinary+" is: ");
        System.out.println(paddedBinary.reverse());

        //Binary to decimal
        highestPower = paddedBinary.toString ();//in order to the highest power
        for (int i = 0; i < highestPower.length (); i++) {
            remander = Integer.parseInt (highestPower.substring (i,i+1));
            decimal += ((remander * Math.pow (2, ((highestPower.length ()-1) - i))));
        }

        int value = (int)decimal;//will change 244.0 -> 244
        String reversedDecimal = String.valueOf (value);//changing to fit return compatibility

        System.out.print("The decimal form of binary: "+paddedBinary+" is: ");
        return reversedDecimal;
    }
}
