package com.example.inherittest.transaction;

import com.example.inherittest.comn.ComnDto;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

// @ToString(callSuper = true)
public class TransactionDto extends TransactionCus{

    public ComnDto getComn(){
        return (ComnDto) this.comn;
    }


    // public void setId(int id) {
    //     this.id = id;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setComn(ComnDto comn) {
        this.comn = comn;
    }

    @Builder
    public TransactionDto(int id, String name,ComnDto comn) {
        super(id, name, comn);
    }

    public String toString() {
        return "id='" + this.getId() + '\'' +
                ", name=" + this.getName() + '\'' +
                ", comn=" + this.getComn() ;
    }

    
    
}
