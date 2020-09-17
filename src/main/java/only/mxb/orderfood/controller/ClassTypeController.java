package only.mxb.orderfood.controller;

import only.mxb.orderfood.entities.ClassType;
import only.mxb.orderfood.mapper.ClassTypeMapper;
import only.mxb.orderfood.service.ClassTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:39
 */
@Controller
public class ClassTypeController {
    @Resource
    ClassTypeService classTypeService;
    /**
     * @param classTypeMapper
     * 插入商品类别
     * @return
     */
    @GetMapping("/insertClassType")
    Integer insertClassType(ClassTypeMapper classTypeMapper){
        return classTypeService.insertClassType(classTypeMapper);
    }

    /**
     * 获取所有商品类别信息
     * @return
     */
    @ResponseBody
    @GetMapping("/selectTypes")
    List<ClassType> selectClassTypes(){
        return classTypeService.selectClassTypes();
    }
}
