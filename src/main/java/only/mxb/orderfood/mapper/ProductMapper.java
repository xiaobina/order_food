package only.mxb.orderfood.mapper;

import only.mxb.orderfood.entities.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-18 20:17
 */
@Mapper
public interface ProductMapper {
    /**
     * 插入产品
     * @param product
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into product (name,price,classid,src) values(#{name},#{price},#{classid},#{src})")
    int insertProduct(Product product);

    /**
     * 根据产品id删除产品
     * @param id
     * @return
     */
    @Delete("delete from product where id=#{id}")
    int deleteProductById(int id);

    /**
     * 通过产品id查询产品
     * @param id
     * @return
     */
    @Select("select id,name,price,classid,src from product where id=#{id}")
    Product selectProductById(int id);

    /**
     * 获取所有产品
     * @return
     */
    @Select("select id,name,price,classid,src from product")
    List<Product> selectProducts();
}

