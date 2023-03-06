package tool.test;

import com.tools.xin.util.String2Numeric;
import org.junit.jupiter.api.Test;

/**
 * @author XIN_CHIN
 * @version 2023.3
 * @date 3/7/2023 3:03 AM
 */
public class String2NumericTest {

    @Test
    public void test(){
        String age = String2Numeric.getNumeric("Hello join, You are 25 years old?");
        System.out.println(age);

        String age2 = String2Numeric.getNumeric2("Hello join, You are 25 years old?");
        System.out.println(age2);

        String age3 = String2Numeric.getNumeric2("Today template is 39.4°");
        System.out.println(age3);


        String template = String2Numeric.getNumericPoints("Today template is 39.4°");
        System.out.println(template);
    }


}
