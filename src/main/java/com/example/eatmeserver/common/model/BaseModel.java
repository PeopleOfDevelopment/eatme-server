package com.example.eatmeserver.common.model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@ToString
@SuperBuilder
public class BaseModel {

    public BaseModel() {
        this.insertDatetime = LocalDateTime.now();
        this.updateDatetime = LocalDateTime.now();
    }

    /**
     * 등록 일시
     */
    private LocalDateTime insertDatetime;

    /**
     * 수정 일시
     */
    private LocalDateTime updateDatetime;


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public LocalDateTime getInsertDatetime() {
        return insertDatetime;
    }

    public void setInsertDatetime(LocalDateTime insertDatetime) {
        this.insertDatetime = insertDatetime;
    }
}
