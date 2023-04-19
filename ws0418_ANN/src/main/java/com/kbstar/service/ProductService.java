package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productservice")
public class ProductService implements MyService<String, UserDTO> {

    @Autowired
    ProductDAO dao;

    @Override
    public void register(UserDTO userDTO) {

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public void modify(UserDTO userDTO) {

    }

    @Override
    public UserDTO get(String s) {
        return null;
    }

    @Override
    public List<UserDTO> get() {
        return null;
    }
}
