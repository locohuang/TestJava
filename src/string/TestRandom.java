package string;

import java.util.Random;

/**
 * Created by Administrator on 2017-5-19.
 */
public class TestRandom {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println((int)(Math.random()*10));
        Random random = new Random();
        System.out.println(random.nextInt(100));
        //练习：随机产生一个4位的验证码，验证码包括：大小写字母，0-9的数字
    }
}
