package org.lanqiao.dao;

import org.lanqiao.bean.Stu;

import java.util.List;

/**
 * @创建人 daishu
 * @创建时间 2018/9/7
 * @描述
 */
public interface IStuDao {
    List<Stu> getAllStu();
    Stu getStuById(int id);
    void deleteStuById(int id);
}
