package com.boss.mall.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boss.mall.entity.Product;
import com.boss.mall.mapper.ProductMapper;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<Product> findByName(String pname) {
        return productMapper.findProductByName(pname);
    }

    public Product insertProduct(Product product) {
        productMapper.insertProduct(product);
        return product;
    }

    public List<Product> ListProduct(){
        return  productMapper.ListProduct();
    }

    public int Update(Product product){
        return productMapper.Update(product);
    }

    public int delete(int pid){
        return productMapper.delete(pid);
    }
}