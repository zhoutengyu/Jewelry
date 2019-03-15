package com.jewelry.springdemo.day0313;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2019/3/14.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    //@Autowired
    //TODO @Autowired可有可无？
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
       cd.play();
    }
}
