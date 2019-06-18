package andy.leaf.service.impl;

import andy.leaf.mapper.UserMapper;
import andy.leaf.pojo.User;
import andy.leaf.service.UserService;
import andy.leaf.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageResult<User> selectUserPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        //创建结果集对象
        PageResult<User> result = new PageResult<>();
        //将结果封装到结果集对象中
        //当前页
        result.setPage(pageNum);
        //每页的数量
        result.setPageSize(pageInfo.getPageSize());
        //总页数
        result.setPageTotal(pageInfo.getPages());
        //总条数
        result.setTotal(pageInfo.getTotal());
        //结果集
        result.setList(pageInfo.getList());
        return result;
    }
}
