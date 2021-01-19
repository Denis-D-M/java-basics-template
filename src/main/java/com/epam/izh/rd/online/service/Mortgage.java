package com.epam.izh.rd.online.service;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Ипотечный займ (упрощенный вариант)
 */
public class Mortgage {

    /**
     * Продукт (например Семейная ипотека)
     */
    @Getter@Setter
    private Product product;

    /**
     * Размер заемных средств
     */
    @Getter
    private BigDecimal amount;

    /**
     * Размер ипотечной ставки
     */
    private BigDecimal interestRate;

    /**
     * Срок кредитования
     */
    private Integer period;

    /**
     * Список продавцов
     */
    private List<Seller> sellers;


    /**
     * Список заявителей
     */
    private List<Applicant> applicants;

    /**
     * Объект недвижимости
     */
    @Getter@Setter
    private Realty realty;

}
