package com.spring.pgdata;

public class Resident {
    private int resnum;

    private int roomnum;
    private String name;
    private String occupation;
    private long adharnum;
    private long num;


    public Resident(int resnum, int roomnum, String name, String occupation, long adharnum,long num) {
        this.resnum = resnum;
        this.roomnum = roomnum;
        this.name = name;
        this.occupation = occupation;
        this.adharnum = adharnum;
        this.num=num;
    }
    @Override
    public String toString() {
        return "Resident information :- " +
                "resnum=" + resnum +
                ", roomnum=" + roomnum +
                ", name='" + name + '\'' +
                ", occupation=" + occupation +
                ", adharnum=" + adharnum +
                ", num=" +num ;
    }
}
