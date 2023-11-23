package com.spring.pgdata;


import java.util.Map;

public class PgData {
    private  int pgid;
    private  String pgname;

    private PgAddress address;
    Map<Resident,RAddress> data;

    public PgData(int pgid, String pgname, PgAddress address, Map<Resident, RAddress> data) {
        this.pgid = pgid;
        this.pgname = pgname;
        this.address = address;
        this.data = data;
    }

    public void details(){
        System.out.println("PG ID :- "+pgid);
        System.out.println("PG Name :- "+pgname);
        System.out.println(address.toString());
        for (Map.Entry<Resident, RAddress> entry:data.entrySet()) {
            System.out.println(entry.getKey()+"\n"+entry.getValue());
        }

    }
}
