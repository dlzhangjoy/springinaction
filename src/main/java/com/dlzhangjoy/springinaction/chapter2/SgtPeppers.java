package com.dlzhangjoy.springinaction.chapter2;

import org.springframework.stereotype.Component;

//@Component
public class SgtPeppers implements CompactDisc {
    private String title="Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";
    @Override
    public String getPlay() {
        return "Playing "+title+" by "+ artist;
    }
}
