package com.hcl.springboot.controller;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferBalanceRequest {

	private String fromAccountNumber;
    private String toAccountNumber;
    private BigDecimal amount;
}
