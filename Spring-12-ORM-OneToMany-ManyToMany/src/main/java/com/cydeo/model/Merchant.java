package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "merchants")
@Data
@NoArgsConstructor
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payoutDelayCount;
    //in onetomany relationship,ownership belongs to Many side
    @OneToMany(mappedBy = "merchant") //so it will map it in Payment, not in separate table merchants_payment_list
    private List<Payment> paymentList; //this one needs to be Collection of payment object. one merchant to many payments.

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
