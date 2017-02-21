package com.hurry.service;

import java.util.Date;

/**
 * Created by lenovo on 2016/12/6.
 */
public class TestDemoListener {
    private static int counter = 0;
    protected void execute()  {
        long ms = System.currentTimeMillis();
        System.out.print("\t\t" + new Date(ms));
        System.out.println("(" + counter++ + ")");
    }
}
