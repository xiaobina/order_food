package only.mxb.orderfood.service.impl;

import only.mxb.orderfood.entities.ClassType;
import only.mxb.orderfood.mapper.ClassTypeMapper;
import only.mxb.orderfood.service.ClassTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:34
 */
@Service("classTypeService")
public class ClassTypeServiceimpl implements ClassTypeService {
    @Resource
    ClassTypeMapper classTypeMapper;
    @Override
    public Integer insertClassType(ClassTypeMapper classTypeMapper) {
        return classTypeMapper.insertClassType(classTypeMapper);
    }

    @Override
    public List<ClassType> selectClassTypes() {
        return classTypeMapper.selectClassTypes();
    }
}
