package io.toya.ch03.test;

import io.toya.ch02.profile.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Sai on 2017/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTest {

    @Autowired
    private DemoBean demoBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "form production profile";
        String actual = demoBean.getContent();
        Assert.assertEquals(expected, actual);
    }

}
