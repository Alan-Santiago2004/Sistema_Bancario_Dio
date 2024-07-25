package com.banco.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "tb_card")
@Table(name = "tb_card")
public class CardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(unique = true)
    private String cardNumber;
    @Column(name = "available_limit")
    private BigDecimal limit;

    public CardModel() {
    }

    public CardModel(UUID id, String cardNumber, BigDecimal limit) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardModel cardModel)) return false;
        return Objects.equals(getId(), cardModel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
