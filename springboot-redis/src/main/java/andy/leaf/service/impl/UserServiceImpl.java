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
        PageResult<User> result = new PageResult<>();
        result.setPage(pageNum);
        result.setPageSize(pageInfo.getPageSize());
        result.setPageTotal(pageInfo.getPages());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }
}
