package com.java.util.string;

import java.util.Random;

/**
 * Created by Chenfer on 2017/3/26.
 */
public class Generate {

    /**
     * 生成用户账号
     * @return
     */
    public static String generateUserId(){
        StringBuilder str=new StringBuilder();//定义变长字符串
        Random random=new Random();
        //随机生成数字，并添加到字符串
        for(int i=0;i<8;i++){
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

}
