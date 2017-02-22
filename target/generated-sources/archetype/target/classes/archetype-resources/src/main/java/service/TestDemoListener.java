#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.Date;

/**
 * Created by lenovo on 2016/12/6.
 */
public class TestDemoListener {
    private static int counter = 0;
    protected void execute()  {
        long ms = System.currentTimeMillis();
        System.out.print("${symbol_escape}t${symbol_escape}t" + new Date(ms));
        System.out.println("(" + counter++ + ")");
    }
}
