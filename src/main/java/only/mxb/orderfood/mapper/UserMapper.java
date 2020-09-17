package only.mxb.orderfood.mapper;

import only.mxb.orderfood.entities.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-17 21:22
 */
@Mapper
public interface UserMapper {
    /**
     * 添加用户
     *
     * @param user
     * @return id(用户id)
     * @Options(useGeneratedKeys = true,keyProperty = "id")//设置返回自增的主键
     * @Insert("insert into department(department_name) values(#{departmentName})")
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")//设置返回主键
    @Insert("insert into user (phone,code) values(#{phone},#{code})")
    int insertUser(User user);

    /**
     * 根据phone删除用户
     *
     * @param phone
     * @return 被影响的行数
     */
    @Delete("delete from user where phone=#{phone}")
    int deleteUserByPhone(String phone);

    /**
     * 修改code
     *
     * @param user
     * @return
     */
    @Update("update user set code=#{code} where phone=#{phone}")
    int updateUserCode(User user);

    /**
     * 根据电话查询用户验证码
     *
     * @param phone
     * @return
     */
    @Select("select phone,code from user where phone=#{phone}")
    User selectUserByPhone(String phone);

    /**
     * 获取所有用户的信息
     *
     * @return
     */
    @Select("select phone,code from user")
    List<User> selectUsers();

}
