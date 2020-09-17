package only.mxb.orderfood.service.impl;

import only.mxb.orderfood.entities.User;
import only.mxb.orderfood.mapper.UserMapper;
import only.mxb.orderfood.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author isalo
 * @date 2020-05-17 21:25
 */
@Service("userService")
public class UserServiceimpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public boolean deleteUserByPhone(String phone) {
        return userMapper.deleteUserByPhone(phone) == 1;
    }

    @Override
    public boolean updateUserByPhone(User user) {
        return userMapper.updateUserCode(user) == 1;
    }

    @Override
    public User selectUserByPhone(String phone) {
        return userMapper.selectUserByPhone(phone);
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }
}
