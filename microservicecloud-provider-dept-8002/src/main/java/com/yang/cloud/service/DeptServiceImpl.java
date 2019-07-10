package com.yang.cloud.service;

import com.yang.cloud.dao.DeptDao;
import com.yang.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author djy
 * @date 2019-07-03 17:14
 */

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao dao;
    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
