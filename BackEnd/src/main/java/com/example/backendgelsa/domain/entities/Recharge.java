package com.example.backendgelsa.domain.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecharge;
    @Column(name = "value", nullable = false)
    private double value;
    @Column(name = "number", length = 10, nullable = false)
    private Long number;
    @Enumerated(EnumType.STRING)
    @Column(name = "operator", nullable = false)
    private Operators operator;
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "seller", nullable = false)
    private String seller;
    @Column(name = "typeRecharge", nullable = false)
    private String typeRecharge;
    @Temporal(TemporalType.TIMESTAMP) // Indica que es un campo de fecha y hora
    @Column(name = "transaction_date", nullable = false)
    private Date transactionDate; // Campo para almacenar la fecha y hora de la transacción
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
