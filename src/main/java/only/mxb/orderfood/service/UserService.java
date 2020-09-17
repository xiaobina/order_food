package only.mxb.orderfood.service;

import only.mxb.orderfood.entities.User;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-17 21:24
 */
public interface UserService {
    /**
     * 插入用户
     *
     * @param user
     * @return userId
     */
    int insertUser(User user);

    /**
     * 删除用户
     *
     * @param phone
     * @return
     */
    boolean deleteUserByPhone(String phone);

    /**
     * 根据手机号修改user验证码
     *
     * @param user
     * @return
     */
    boolean updateUserByPhone(User user);

    /**
     * 通过电话查询用户
     *
     * @param phone
     * @return
     */
    User selectUserByPhone(String phone);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> selectUsers();
}
