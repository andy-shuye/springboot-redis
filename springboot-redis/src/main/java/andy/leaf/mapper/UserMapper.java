package andy.leaf.mapper;

import andy.leaf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> selectAll();
}
