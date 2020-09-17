package only.mxb.orderfood.service;

import only.mxb.orderfood.entities.ClassType;
import only.mxb.orderfood.mapper.ClassTypeMapper;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:33
 */
public interface ClassTypeService {
    /**
     * 插入商品类别
     * @param classTypeMapper
     * @return
     */
    Integer insertClassType(ClassTypeMapper classTypeMapper);

    /**
     * 获取所有商品类别信息
     * @return
     */
    List<ClassType> selectClassTypes();
}
