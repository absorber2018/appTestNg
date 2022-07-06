package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import javax.xml.transform.Result;

public class testmain {
    public static void main(String[] args){
        Result re = (Result) JUnitCore.runClasses(resultTest.class);
            System.out.println(re.toString());
    }
}
