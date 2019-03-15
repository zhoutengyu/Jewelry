package com.jewelry.springdemo.day0313;

import java.util.List;

/**
 * Created by admin on 2019/3/15.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("正在播放："+title+"歌手："+artist);
        tracks.forEach(x-> System.out.println("歌名："+x));
    }
}
