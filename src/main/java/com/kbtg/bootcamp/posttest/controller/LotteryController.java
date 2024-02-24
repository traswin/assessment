package com.kbtg.bootcamp.posttest.controller;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.request.LotteryRequestDto;
import com.kbtg.bootcamp.posttest.lottery.Ticket;
import com.kbtg.bootcamp.posttest.service.LotteryService;
import com.kbtg.bootcamp.posttest.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LotteryController {
    private final LotteryService lotteryService;
    private final TicketService ticketService;


    public LotteryController(LotteryService lotteryService, TicketService ticketService) {
        this.lotteryService = lotteryService;
        this.ticketService = ticketService;
    }


    //ex01
    @PostMapping("/admin/lotteries")
    public Lottery createLottery(@RequestBody LotteryRequestDto RequestDto) {
        return lotteryService.createLottery(RequestDto);
    }


    //ex02
    @GetMapping("/lotteries")
    public List<Lottery> getLotteryList(){
        return lotteryService.getLotteryList();
    }

    @GetMapping("/ticket")
    public List<Ticket>getTicketList(){
    return ticketService.getTicketList();
    }

    //ex03
    @PostMapping("/users/{userid}/lotteries/{ticketid}")
    public Ticket createTicket(@PathVariable Integer userid, @PathVariable String ticketid){
        return ticketService.createTicket(userid, ticketid);
    }

    //ex04
    @GetMapping("/users/{userid}/lotteries")
    public List<Ticket> getTicketByUser(@PathVariable Integer userid){
        return ticketService.getTicketByUser(userid);
    }

    //ex5
    @DeleteMapping("/users/{userid}/lotteries/{ticketid}")
    public void deleteTicket(@PathVariable Integer userid, @PathVariable String ticketid){
        ticketService.deleteTicket(userid, ticketid);
    }



}
