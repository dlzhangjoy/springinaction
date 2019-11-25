package com.dlzhangjoy.springinaction.chapter2;

//@Component
public class WhiteAlbum implements CompactDisc {
    private String title="WhiteAlbum";
    private String artist="Zdl";
    @Override
    public String getPlay() {
        return "Playing "+title+" by "+ artist;
    }
}
