package only.mxb.orderfood.controller;

import only.mxb.orderfood.entities.Product;
import only.mxb.orderfood.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author isalo
 * @date 2020-05-18 20:09
 */
@RestController
public class ProductController {
    @Resource
    ProductService productService;

    /**
     * 插入产品
     * @param product
     * @return
     */
    @GetMapping("/insertProduct")
    Integer insertProduct(Product product){
        return productService.insertProduct(product);
    }

    /**
     * 根据产品id删除产品
     * @param id
     * @return
     */
    @GetMapping("/deleteProductById")
    Boolean deleteProductById(int id){
        return productService.deleteProductById(id);
    }

    /**
     * 通过产品id查询产品
     * @param id
     * @return
     */
    @GetMapping("/selectProductById")
    Product selectProductById(int id){
        return productService.selectProductById(id);
    }

    /**
     * 获取所有产品
     * @return
     */
    @GetMapping("/selectProducts")
    List<Product> selectProducts(){
        System.out.println("selectProducts");
        return productService.selectProducts();
    }
}
