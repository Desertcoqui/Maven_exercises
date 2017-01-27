import org.apache.commons.lang3.StringUtils;

/**
 * Created by PapoteDetres1 on 1/27/17.
 */
public class StringApp {
    public static void main(String[] args) {
        String message= "Hello World";
        String reverseMessage = StringUtils.reverse(message);
        boolean isNumber = StringUtils.isNumeric(message);
        String swap= StringUtils.swapCase(message);
        if(!isNumber){
            System.out.println("What you entered is not a number");
        }
        System.out.println(reverseMessage);
        System.out.println(swap);
    }
}
