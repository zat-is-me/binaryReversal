//Author Tatek Ahmed
public class App {
    public static void main(String[] args) {
        Integer num = 47;

        StringBuffer binary = BinaryReversal.decimalToBinary(num.toString());

        System.out.println("The binary form of: "+num+" is: "+binary);

        StringBuffer paddedBinary = BinaryReversal.binaryPadding(String.valueOf (47));

        paddedBinary = paddedBinary.append(binary);

        System.out.println("Eight digit binary is: "+paddedBinary);

        paddedBinary.reverse();

        System.out.println("reversed binary value is: "+ paddedBinary);

        String finalValue = String.valueOf(BinaryReversal.binaryToDecimal(paddedBinary.toString()));

        System.out.println("Final Value: "+finalValue);
    }
}