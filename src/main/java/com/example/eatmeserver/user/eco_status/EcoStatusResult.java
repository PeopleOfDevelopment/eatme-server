package com.example.eatmeserver.user.eco_status;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EcoStatusResult {
    private Integer saveTree;
    private Integer thisYearStatus;
    private Integer lastYearStatus;

    public EcoStatusResult(int saveTree, int thisYearStatus, int lastYearStatus) {
        this.saveTree = saveTree;
        this.thisYearStatus = thisYearStatus;
        this.lastYearStatus = lastYearStatus;
    }
}
