package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017\8\7 0007.
 */

//DAO interface
public interface GirlRespository  extends JpaRepository<Girl,Integer>{

    //通过年龄
    public List<Girl> findByAge(Integer age);
}
