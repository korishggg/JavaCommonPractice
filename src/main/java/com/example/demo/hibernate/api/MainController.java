//package com.example.demo.hibernate.api;
//
//import com.example.demo.hibernate.dao.IGenericDao;
//import com.example.demo.hibernate.domain.Employee;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employees")
//public class MainController {
//
//    private IGenericDao iGenericDao;
//
//    public MainController(IGenericDao iGenericDao) {
//        this.iGenericDao = iGenericDao;
//    }
//
//    @GetMapping
//    public List<Employee> getAllEmployees(){
//        return iGenericDao.findAll();
//    }
//
//}
