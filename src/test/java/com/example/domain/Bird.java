package com.example.domain;

public class Bird implements Animal {
    @Override
    public String bite() {
        return "부리로 콕콕";
    }
}
