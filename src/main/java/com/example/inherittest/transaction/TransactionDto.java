package com.example.inherittest.transaction;

import com.example.inherittest.comn.ComnDto;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

// @ToString(callSuper = true)
public class TransactionDto extends TransactionCus{

    public ComnDto getComn(){
        return (ComnDto) super.comn;
    }


    public void setId(int id) {
        super.id = id;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setComn(ComnDto comn) {
        super.comn = comn;
    }

    @Builder
    public TransactionDto(int id, String name,ComnDto comn) {
        super(id, name, comn);
    }

    public String toString() {
        return "id='" + super.getId() + '\'' +
                ", name=" + super.getName() + '\'' +
                ", comn=" + super.getComn() ;
    }

    
    
}
