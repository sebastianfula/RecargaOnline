package com.example.backendgelsa.domain.dto;

import com.example.backendgelsa.domain.entities.Operators;
import lombok.Data;

import java.util.Date;

@Data
public class RechargeDto {

    private Long idRecharge;
    private double value;
    private Long number;
    private Operators operator;
    private String estatus;
    private String seller;
    private Date transactionDate;
    private String typeRecharge;
    public Long getIdRecharge() {
        return idRecharge;
    }

    public void setIdRecharge(Long idRecharge) {
        this.idRecharge = idRecharge;
    }

    // Getter y Setter para value
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Getter y Setter para number
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    // Getter y Setter para operator
    public Operators getOperator() {
        return operator;
    }

    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    // Getter y Setter para estatus
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    // Getter y Setter para seller
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    // Getter
    public String getTypeRecharge() {
        return this.typeRecharge;
    }

    // Setter
    public void setTypeRecharge(String typeRecharge) {
        this.typeRecharge = typeRecharge;
    }
}
