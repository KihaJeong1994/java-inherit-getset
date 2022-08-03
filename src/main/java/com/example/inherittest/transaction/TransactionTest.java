package com.example.inherittest.transaction;

import com.example.inherittest.comn.ComnCus;
import com.example.inherittest.comn.ComnDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionTest {
    public static void main(String[] args) {
        TransactionDto transactionDto = TransactionDto.builder().id(1).name("David").comn(ComnDto.builder().address("Seoul").build()).build();
        transactionDto.setId(2);
        transactionDto.setName("Ann");
        transactionDto.getComn().setAddress("Incheon");
        log.info("TransactionDto: {}",transactionDto);

        TransactionCus transactionCus = transactionDto;
        transactionCus.setId(3);
        log.info("TransactionCus: {}",transactionCus);
        log.info("TransactionDto: {}",transactionDto);
    }
}
