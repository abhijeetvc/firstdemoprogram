package com.novfirstbatchdemo.firstdemoprogram.impl;

import com.novfirstbatchdemo.firstdemoprogram.interfaces.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {

    @Override
    public String getData() {
        return "Hello Spring!!!! ";
    }
}
