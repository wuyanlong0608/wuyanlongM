package com.zx.springcloud.entitles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Payment implements Serializable {
    private long id;
    private String serial;

    public Payment(long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    public long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
