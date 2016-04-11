import consys.dao.UserMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext.xml"})
@ActiveProfiles("loc")
public class TestUnit {

    private static final Logger logger = LogManager.getLogger("TestH");
    @Autowired
    UserMapper userMapper;
    @Before
    public void before() {
      
    }

    @Test
    public void testShuxing(){
        System.out.println(1);
    }
    
}
