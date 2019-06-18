package andy.leaf.controller;

import andy.leaf.pojo.User;
import andy.leaf.service.UserService;
import andy.leaf.utils.PageResult;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String haha(HttpServletRequest request, @RequestParam(defaultValue = "1") Integer pageNum) {
        Object o = redisTemplate.opsForValue().get(pageNum+"");
        if (o != null) {
            String infoRedis = redisTemplate.opsForValue().get(pageNum + "") + "";
            request.setAttribute("pageResult", JSON.parseObject(infoRedis, PageResult.class));
            System.out.println("查询了redis，未查询mysql");
            return "list";
        } else {
            Integer pageSize = 5;
            PageResult<User> userPageResult = userService.selectUserPage(pageNum, pageSize);
            System.out.println(userPageResult);
            request.setAttribute("pageResult", userPageResult);
            redisTemplate.opsForValue().set(pageNum + "", JSON.toJSON(userPageResult));
            System.out.println("查询了mysql");
            return "list";
        }

    }
}
