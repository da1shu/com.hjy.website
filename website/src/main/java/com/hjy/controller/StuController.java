package org.lanqiao.controller;

import org.lanqiao.bean.Stu;
import org.lanqiao.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 daishu
 * @创建时间 2018/9/7
 * @描述
 */


@RestController
@RequestMapping("/stus")
public class StuController {

    @Autowired
    IStuService stuService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Stu getStuById(@PathVariable int id){
        return stuService.getStuById(id);
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Stu> getAllStu(){
        System.out.println(stuService.getAllStu());
        return stuService.getAllStu();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteStuById(@PathVariable int id){
         stuService.deleteStuById(id);
    }


}
