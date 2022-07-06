package com.test;

import com.test.base.startDriver;
import com.test.operate.click;
import org.testng.annotations.Test;

public class resultTest {
    @Test
    public static void main(String[] args) {
         String deviceName = new String("iphone 6s");
         String platForm = new String("IOS");
         String appPackage = new String("com.welkj.derucci");
         String platformVersion = new String("14.4");
         String udid = new String("592a01baa9ee4ab14e4e5b2896fb9413c3813c1d");

         startDriver startDriver = new startDriver();
         startDriver.SetUp(deviceName, platForm, appPackage, platformVersion,udid);
         click click = new click();
         click.testclick();
//        @AfterTest
//        public void afterTest () {
//        }
        //输出报告
    }
}