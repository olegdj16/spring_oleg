package com.olegarts.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{

    BigDecimal creditLimit;
}
