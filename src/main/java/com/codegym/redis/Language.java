package com.codegym.redis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    //Getters and Setters omitted
}