package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements MyDao<String, ProductDTO> {
    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle" + productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle" + s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle" + productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO("id01","tv",5,3000);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add( new ProductDTO("id01","tv",5,3000));
        list.add( new ProductDTO("id02","radio",3,1000));
        list.add( new ProductDTO("id03","laptop",2,5000));
        return list;
    }
}
