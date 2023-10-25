package com.example.eatmeserver.user.eco_status;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class EcoStatusParam {
    private LocalDate thisYear;
    private LocalDate lastYear;
}
