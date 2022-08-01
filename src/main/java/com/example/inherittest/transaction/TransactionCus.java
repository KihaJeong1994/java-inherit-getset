package com.example.inherittest.transaction;

import com.example.inherittest.comn.ComnCus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionCus {
    
    protected int id;
    protected String name;
    protected ComnCus comn;

}
