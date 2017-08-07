package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017\8\7 0007.
 */


@RestController
public class GirlController {

    @Autowired
    private  GirlRespository girlRespository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return  girlRespository.findAll();
    }


    @PostMapping(value = "/addgirl")
    public Girl  girladd(@RequestParam("cupSize") String cupSize,
                         @RequestParam("age")  Integer age
    ){
        Girl girl=new Girl();
         girl.setAge(age);
        girl.setCupSize(cupSize);
        return     girlRespository.save(girl);
    }

    @GetMapping(value = "/find/{id}")
    public Girl  findOne(@PathVariable("id") Integer id){
        return  girlRespository.findOne(id);
    }


    @PutMapping(value = "/update/{id}")
    public Girl  updateGirl(@PathVariable("id") Integer id,
                            @RequestParam("age")  Integer newage,
                            @RequestParam("cupsize") String  newSize) {

       Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(newage);
        girl.setCupSize(newSize);
        return girlRespository.save(girl);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void  girldelete(@PathVariable("id") Integer id){
        girlRespository.delete(id);

    }

    @GetMapping(value = "/findage/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age){
        return  girlRespository.findByAge(age);
    }



}
