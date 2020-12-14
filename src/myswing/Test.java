package myswing;

/**
 * author yg
 * description
 * date 2020/12/14
 */
public class Test {
   static String str="yes i am right goo\\nabc";

    public static void main(String[] args) {
        String[] split = str.split("\\s+|\\\\n+");
        System.err.println(split);
    }
}
