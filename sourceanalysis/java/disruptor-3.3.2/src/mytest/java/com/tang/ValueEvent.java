package com.tang;

import com.lmax.disruptor.EventFactory;

public class ValueEvent {

	private long value;

    public void set(long value)
    {
        this.value = value;
    }
    
    
}
