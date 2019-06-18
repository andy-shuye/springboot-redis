package andy.leaf.service;

import andy.leaf.pojo.User;
import andy.leaf.utils.PageResult;

public interface UserService {
    public PageResult<User> selectUserPage(Integer pageNum, Integer pageSize);
}
