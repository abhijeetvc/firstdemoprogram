package com.novfirstbatchdemo.firstdemoprogram.controller;

import com.novfirstbatchdemo.firstdemoprogram.impl.MyImpl;
import com.novfirstbatchdemo.firstdemoprogram.impl.MyImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @Autowired
    private MyImpl1 myImpl1;

//    public MyController(MyImpl myImpl){
//        System.out.println("Hiiiiiiiiiiiiiiiiiiiii");
//        this.myImpl=myImpl;
//    }

//    public MyController(MyImpl1 myImpl1){
//        System.out.println("Heeeeeelllllooooooo");
//        this.myImpl1=myImpl1;
//    }

//    @Autowired
//    public void setMyImpl(MyImpl myImpl) {
//        this.myImpl = myImpl;
//    }

    @GetMapping(value="/check")
    public String check(){
        return myImpl.getData();
    }
}
