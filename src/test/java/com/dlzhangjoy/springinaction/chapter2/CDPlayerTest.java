package com.dlzhangjoy.springinaction.chapter2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CDPlayerTest{
    @Autowired
    private CDPlayer cdPlayer1;
    @Autowired
    private CDPlayer cdPlayer2;
    @Autowired
    private CDPlayer cdPlayer3;
    @Autowired
    private CDPlayer cdPlayer4;
    @Autowired
    private CDPlayer cdPlayer5;
    @Autowired
    private CDPlayer cdPlayer6;
    @Autowired
    private CDPlayer cdPlayer7;
    @Autowired
    private CDPlayer cdPlayer8;
    @Test
    public void cdPlay(){
        System.out.print("cdPlayer1:");cdPlayer1.play();
        System.out.print("cdPlayer2:");cdPlayer2.play();
        System.out.print("cdPlayer3:");cdPlayer3.play();
        System.out.print("cdPlayer4:");cdPlayer4.play();
        System.out.print("cdPlayer5:");cdPlayer5.play();
        System.out.print("cdPlayer6:");cdPlayer6.play();
        System.out.print("cdPlayer7:");cdPlayer7.play();
        System.out.print("cdPlayer8:");cdPlayer8.play();
    }
}
