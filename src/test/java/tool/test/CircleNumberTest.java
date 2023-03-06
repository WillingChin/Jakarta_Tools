package tool.test;

import com.tools.xin.util.CircleNumber;
import org.junit.jupiter.api.Test;


/**
 * @author XIN_CHEN
 * @date 3/7/2023 2:59 AM
 * @version 2023.3
 */
public class CircleNumberTest {


    /**
     * print result
     * ①
     * ⑳
     */
    @Test
    public void test2(){
        char data1 = CircleNumber.getCircleNumber(1);
        System.out.println(data1);
        char data2= CircleNumber.getCircleNumber(20);
        System.out.println(data2);


    }

//    @Test
    public void test(){
        String num = "①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳";
        char circle = '①';


        System.out.println(num);
        System.out.println(circle+":"+(int)circle);
        for (int i = 0; i < 500; i++) {
            int firstCircle = 9312+i;
            System.out.println((char)firstCircle);
        }

        System.out.println(".;..".split(";").length);

        char circle2 = 41689;
        System.out.println(circle2);
    }


}
