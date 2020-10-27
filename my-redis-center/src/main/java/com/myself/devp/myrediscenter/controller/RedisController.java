package com.myself.devp.myrediscenter.controller;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RedisController {

     String  st= new String("hhhh");
     String[]   strArray=new String[]{"a","s","s"};

     public void  test(String str1,String str2){
          st=str1;
          strArray[0]=str2;
          System.out.println(st);
          for (int i = 0; i <strArray.length ; i++) {

               System.out.println(strArray[i]);
          }
     }



     public static void main(String[] args) {
/*          RedisController redisController = new RedisController();
          redisController.test("ggg","b");
          */
          String a="fff";
          String b="fff";
          String c=new String("jjj");
          String d=new String("jjj");
          System.out.println(c.equals(d));
          Executors.newFixedThreadPool(8);
     }
}
