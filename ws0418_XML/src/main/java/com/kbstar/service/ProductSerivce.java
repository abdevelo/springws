package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;

import java.util.List;

public class ProductSerivce implements MyService<String, ProductDTO> {

    MyDao<String, ProductDTO> dao;

    public ProductSerivce(MyDao<String, ProductDTO> dao) {
        this.dao = dao;
    }

    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("send Mail...");
    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
    }

    @Override
    public ProductDTO get(String s) {
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}
