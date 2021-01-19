package com.epam.izh.rd.online.service;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Запрос для расчета графика платежей
 */
public class PaymentScheduleRequest {

    /**
     * Размер заемных средств
     */
    @Getter@Setter
    private BigDecimal amount;

    /**
     * Размер ипотечной ставки
     */
    @Getter@Setter
    private BigDecimal interestRate;

    /**
     * Срок кредитования
     */
    @Getter@Setter
    private Integer period;

}
