package com.test.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class startDriver {

//    public static AndroidDriver<WebElement> androidDriver;
    public static IOSDriver<WebElement> IOSDriver;

    public static void SetUp(String deviceName, String platForm, String appPackage, String platformVersion, String udid) {
         /*1.添加配置
           2.创建驱动
         */
        //1.1.创建配置对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //1.2.添加配置
        desiredCapabilities.setCapability("deviceName", deviceName);
        //1.3.platform:测试平台Andriod or ios
        desiredCapabilities.setCapability("platForm", platForm);
        desiredCapabilities.setCapability("udid" , udid);
        //1.4.appPackage 找到要测试的App
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        //1.5.appActivity 测试app的启动入口
        desiredCapabilities.setCapability("bundleld", appPackage);
        //2.创建驱动
        try {
            IOSDriver = new IOSDriver<WebElement>(
                    new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (Exception driver) {
            System.out.println("android driver object : url , configration maybe have some things is wrong ");
        }
    }
}

