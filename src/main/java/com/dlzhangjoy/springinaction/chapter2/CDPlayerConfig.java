package com.dlzhangjoy.springinaction.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer1(CompactDisc randomBeatCD){
        return new CDPlayer(randomBeatCD);
    }
    @Bean
    public CDPlayer cdPlayer2(CompactDisc randomBeatCD){
        return new CDPlayer(randomBeatCD);
    }
    @Bean
    public CDPlayer cdPlayer3(CompactDisc randomBeatCD){
        return new CDPlayer(randomBeatCD);
    }
    @Bean
    public CDPlayer cdPlayer4(CompactDisc randomBeatCD){
        return new CDPlayer(randomBeatCD);
    }
    @Bean
    public CDPlayer cdPlayer5(){
        return new CDPlayer(randomBeatCD());
    }
    @Bean
    public CDPlayer cdPlayer6(){
        return new CDPlayer(randomBeatCD());
    }
    @Bean
    public CDPlayer cdPlayer7(){
        return new CDPlayer(randomBeatCD());
    }
    @Bean
    public CDPlayer cdPlayer8(){
        return new CDPlayer(randomBeatCD());
    }
    @Bean
    public CompactDisc randomBeatCD(){
        int choice=(int)Math.floor(Math.random()*4);
        System.out.println("Init randomBeatCD:"+choice);
        if(choice<2){
            return new SgtPeppers();
        }else{
            return new WhiteAlbum();
        }
    }
}
