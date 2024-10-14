import java.util.Scanner;
import org.junit.Test;
import target.Solution12;

import java.io.*;

public class L2022211969_12_Test {
    static Solution12 worker = new Solution12();
/**
    public static void main(String[] args) throws IOException {
        String x,y;

        Scanner = new Scanner(System.in);
        x = scanner.next();
        y = scanner.next();
        System.out.println( worker.multiply(x, y));
        scanner.close();
    }
 **/
    //考虑根据输入类型划分进行用例测试
    //划分输入为合法输入与不合法输入
    //在合法输入中有单独为零的特殊情况
    @Test
    public void Input_zero (){
        assert worker.multiply("0","111").equals("0");
    }

    //以输入符号为例展示不合法输入的处理
    @Test
    public void Input_neg() throws Exception {
        try {
            worker.multiply("-1","111");
        }catch (IllegalArgumentException e){
            return;
        }
        throw new Exception("error handling invalid input");
    }

    //对于合法输入，测试面对大数字输入的可行性
    //answer based on browser is 246913579975308650
    @Test
    public void Big_input(){
        String ans = worker.multiply("111111111","2222222222");
        assert ans.equals("246913579975308642");
    }

    //还存在以零开头后接数字的输入bug
    //在源代码输入处理循环中修改循环不变量并添加判断语句即可

}
