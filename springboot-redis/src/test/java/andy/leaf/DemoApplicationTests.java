package andy.leaf;

import andy.leaf.pojo.Address;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        /*redisTemplate.opsForValue().set("name", "haha");
        String name = (String) redisTemplate.opsForValue().get("name");

        System.out.println(name);*/

        /*Address address = new Address();
        address.setCountry("中国");
        address.setCity("北京");
        redisTemplate.opsForValue().set("address", address);
        Object a = redisTemplate.opsForValue().get("address");
        System.out.println(a);*/
        /*Object xixi = redisTemplate.opsForValue().get("xixi");
        System.out.println(xixi);*/
        /*Address address1 = new Address();
        Address address2 = new Address();
        List<Address> list = new ArrayList<>();
        address1.setCountry("中国");
        address1.setCity("北京");
        address2.setCountry("中国");
        address2.setCity("北京");
        list.add(address1);
        list.add(address2);
        String str = JSON.toJSON(list).toString();
        System.out.println(str);
        redisTemplate.opsForValue().set("xixi", str);
        Object xixi = redisTemplate.opsForValue().get("xixi");
        System.out.println(xixi);*/
        Address address1 = new Address();
        Address address2 = new Address();
        List<Address> list = new ArrayList<>();
        address1.setCountry("中国");
        address1.setCity("北京");
        address2.setCountry("中国");
        address2.setCity("北京");
        list.add(address1);
        list.add(address2);
        Haha haha = new Haha();
        haha.setName("haha");
        haha.setAge("12");
        haha.setAddresses(list);
        String s = JSON.toJSON(haha).toString();
//        System.out.println(s);
        Haha haha1 = JSON.parseObject(s, Haha.class);
        System.out.println(haha1);
    }
}
