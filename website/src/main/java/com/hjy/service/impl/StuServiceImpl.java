package org.lanqiao.service.impl;

import org.lanqiao.bean.Stu;
import org.lanqiao.dao.IStuDao;
import org.lanqiao.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 daishu
 * @创建时间 2018/9/7
 * @描述
 */

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    IStuDao stuDao;
    @Override
    public List<Stu> getAllStu() {
        return stuDao.getAllStu();
    }

    @Override
    public Stu getStuById(int id) {
        return stuDao.getStuById(id);
    }

    @Override
    public void deleteStuById(int id) {
        stuDao.deleteStuById(id);
    }
}
