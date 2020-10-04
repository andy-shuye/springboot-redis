package andy.leaf.mapper;

import andy.leaf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
	
	//测试
    public List<User> selectAll();
}
