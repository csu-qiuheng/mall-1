package com.boss.mall.controller;

import com.boss.mall.entity.Product;
import com.boss.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/Product", method = { RequestMethod.GET, RequestMethod.POST },produces = "application/json; charset=utf-8")
public class ProductController {
    @RequestMapping("/ListProduct")
    @ResponseBody
    //泛型
    public List<Product> ListProduct(){
        return productService.ListProduct();
    }

    //对数据库进行查找操作
    @RequestMapping("/ListProductByname")
    @ResponseBody
    public List<Product> ListProductByname(String pname){
        return productService.findByName(pname);
    }

    @Autowired
    private ProductService productService;

    //对数据库进行的删除操作
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int pid) {
        int result = productService.delete(pid);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Product product) {
        int result = productService.Update(product);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }



    //对数据库进行增加字段操作
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Product insert(Product product)
    {
        return productService.insertProduct(product);
    }
}