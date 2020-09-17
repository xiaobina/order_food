package only.mxb.orderfood.service;

import only.mxb.orderfood.entities.Product;

import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:05
 */
public interface ProductService {
    /**
     * 插入产品
     * @param product
     * @return  产品id
     */
    Integer insertProduct(Product product);

    /**
     * 根据产品id删除产品
     * @param id
     * @return
     */
    boolean deleteProductById(Integer id);

    /**
     * 通过产品id查询产品
     * @param id
     * @return
     */
    Product selectProductById(Integer id);

    /**
     * 获取所有产品
     * @return
     */
    List<Product> selectProducts();
}
