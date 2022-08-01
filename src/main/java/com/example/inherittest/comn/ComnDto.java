package com.example.inherittest.comn;

import lombok.Builder;
import lombok.ToString;
@ToString
public class ComnDto extends ComnCus{
    
    public void setAddress(String address){
        super.address = address;
    }

    @Builder
    public ComnDto(String address) {
        super(address);
    }

    public String toString() {
        return "id='" + super.getAddress();
    }

    
}
