package com.kbtg.bootcamp.posttest.request;

public class TicketRequestDto {
    private Integer userid;
    private String ticketid;

    public TicketRequestDto() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }
}
