package base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lenovo on 2016/12/4.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"classpath*:spring/spring-context-beans.xml",
                "classpath*:spring/spring-context-common.xml"
        })
public class TestBase {

}
