import java.util.ArrayList;
import java.util.List;

/**
 * @author tatek on 6/1/2023
 */
public class BinaryArray {

    public static List<String> binaryArray(List<String> al){

        List<String> arrayList = new ArrayList<>();
        List<String> arrayListDecimal = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            String originalDecimal = BinaryReversal.decimalToBinary(al.get(i)).toString();

            StringBuffer padding = BinaryReversal.binaryPadding(al.get(i));
            padding.append(originalDecimal);

            padding.reverse();

            arrayList.add(padding.toString());

           arrayListDecimal.add( BinaryReversal.binaryToDecimal(arrayList.get(i)).toString());
        }
        return arrayListDecimal;
    }

}
