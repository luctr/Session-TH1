package com.model;

public class Counter {
    private Long count;

    public Counter(Long count) {
        this.count = count;
    }

    public Counter() {
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
    public Long increment(){
        return count++;
    }
}
