import java.util.ArrayList;
import java.util.List;

//Author Tatek Ahmed
public class App {
    public static void main(String[] args) {
        Integer num = 47;

        List<String> al = new ArrayList<>();
        al.add("47");
        al.add("60");
        al.add("80");
        al.add("90");


        StringBuffer binary = BinaryReversal.decimalToBinary(num.toString());

        System.out.println("The binary form of: "+num+" is: "+binary);

        StringBuffer paddedBinary = BinaryReversal.binaryPadding(String.valueOf (47));

        paddedBinary = paddedBinary.append(binary);

        System.out.println("Eight digit binary is: "+paddedBinary);

        paddedBinary.reverse();

        System.out.println("reversed binary value is: "+ paddedBinary);

        String finalValue = String.valueOf(BinaryReversal.binaryToDecimal(paddedBinary.toString()));

        System.out.println("Final Value: "+finalValue);

        //Pass list of numbers and changed to binary after the change reversed the binary and
        // change it to decimal then returned as a list of decimal.
        System.out.println(BinaryArray.binaryArray(al));
    }
}