package com.boss.mall.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.boss.mall.entity.Product;

@Mapper
public interface ProductMapper {

    List<Product> findProductByName(String pname);

    public List<Product> ListProduct();

    public int insertProduct(Product product);

    public int delete(int pid);

    public int Update(Product product);
}