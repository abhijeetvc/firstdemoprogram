package com.novfirstbatchdemo.firstdemoprogram.impl;

import com.novfirstbatchdemo.firstdemoprogram.interfaces.MyInterface1;
import org.springframework.stereotype.Service;

@Service
public class MyImpl1 implements MyInterface1 {
    @Override
    public String check1() {
        return "Hello Spring@@@@@@@@";
    }
}
