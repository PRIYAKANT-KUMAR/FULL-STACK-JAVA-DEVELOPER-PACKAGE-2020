package com.bank.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "transaction_detail")
@Data
public class TransactionDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long txId;	
	private LocalDate txDate;
	private String txDateTime;
	private Integer amount;
	private String txType;
	private String remarks;
	
	@NotNull(message = "account number can't be empty")
	@Column(name = "tx_account_no", unique = false)
	private String txAccountNo;

}
