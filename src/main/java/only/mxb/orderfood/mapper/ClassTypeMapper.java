package only.mxb.orderfood.mapper;

import only.mxb.orderfood.entities.ClassType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:24
 */
@Mapper
public interface ClassTypeMapper {
    /**
     * 插入商品类别
     * @param classTypeMapper
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into class_type (name) values(#{name})")
    Integer insertClassType(ClassTypeMapper classTypeMapper);

    /**
     * 获取所有商品类别信息
     * @return
     */
    @Select("select id,name from class_type")
    List<ClassType> selectClassTypes();
}
