package com.yang.cloud.service;

import com.yang.cloud.entities.Dept;

import java.util.List;

/**
 * @author djy
 * @date 2019-07-03 17:14
 */


public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
