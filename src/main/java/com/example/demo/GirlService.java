package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017\8\7 0007.
 */
@Service
public class GirlService {

    @Autowired
    private  GirlRespository girlRespository;

    public void insertTwo(){
        Girl  girl=new Girl();
            girl.setCupSize("E");
            girl.setAge(18);
        girlRespository.save(girl);

        Girl girl2=new Girl();
           girl2.setAge(20);
           girl2.setCupSize("F");
        girlRespository.save(girl2);

    }
}
