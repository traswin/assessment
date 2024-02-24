package com.kbtg.bootcamp.posttest.repository;

import com.kbtg.bootcamp.posttest.lottery.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByUserid(Integer userid);



}
