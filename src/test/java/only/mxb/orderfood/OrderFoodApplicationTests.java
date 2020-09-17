package only.mxb.orderfood;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OrderFoodApplicationTests {

//    @Autowired
//    DataSource dataSource;

    @Resource
    DruidDataSource dataSource;
    @Test
    void contextLoads() throws Exception{
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }


}
