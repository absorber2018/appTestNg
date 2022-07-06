package com.test.operate;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.junit.*;
import java.util.List;

//import static com.test.base.startDriver.androidDriver;
import static com.test.base.startDriver.IOSDriver;

public class click {
    public static void testclick(){
        //等待元素加载完毕
        IOSDriver.findElementByName("添加智能设备").click();
        try{
            Thread.sleep(2000);
        }catch (Exception  e){
            e.printStackTrace();
        }
//        IOSDriver.findElementByName("我的设备").click();
//        try{
//            Thread.sleep(2000);
//        }catch (Exception  e){
//            e.printStackTrace();
//        }
//        IOSDriver.findElementById("com.welkj.derucci:id/more_iv").click();
//        try{
//            Thread.sleep(2000);
//        }catch (Exception  e){
//            e.printStackTrace();
//        }
//        IOSDriver.findElementById("com.welkj.derucci:id/pop_add_device").click();
//
//        try{
//            Thread.sleep(2000);
//        }catch (Exception  e){
//            e.printStackTrace();
//        }
//        IOSDriver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
//        try{
//            Thread.sleep(5000);
//        }catch (Exception  e){
//            e.printStackTrace();
//        }
//        String expected = "添加设备";
//        WebElement element = (WebElement) IOSDriver.findElementsById("com.welkj.derucci:id/tv_title");
//        String actul = element.getText();
//        org.junit.Assert.assertEquals(actul,expected);
        IOSDriver.quit();
    }
}
