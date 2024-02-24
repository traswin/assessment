package com.kbtg.bootcamp.posttest.service;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.repository.LotteryRepository;
import com.kbtg.bootcamp.posttest.request.LotteryRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService {
    private final LotteryRepository lotteryRepository;


    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;

    }
    public List<Lottery>getLotteryList(){
        return lotteryRepository.findAll();
    }


    public Lottery createLottery(LotteryRequestDto RequestDto){
        Lottery lottery = new Lottery();
        lottery.setTicket(RequestDto.getTicket());
        lottery.setPrice(RequestDto.getPrice());
        lottery.setAmount(RequestDto.getAmount());
        lotteryRepository.save(lottery);
        return lottery;



    }



}
