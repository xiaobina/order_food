package only.mxb.orderfood.service.impl;

import only.mxb.orderfood.entities.Product;
import only.mxb.orderfood.mapper.ProductMapper;
import only.mxb.orderfood.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author isalo
 * @date 2020-05-19 19:08
 */
@Service("productService")
public class ProductServiceimpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    @Override
    public Integer insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Override
    public boolean deleteProductById(Integer id) {
        return productMapper.deleteProductById(id)==1;
    }

    @Override
    public Product selectProductById(Integer id) {
        return productMapper.selectProductById(id);
    }

    @Override
    public List<Product> selectProducts() {
        return productMapper.selectProducts();
    }
}
