package com.example.backendgelsa.adapter.repository;
import com.example.backendgelsa.domain.entities.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RechargeRepository extends JpaRepository<Recharge, Long> {

    @Query(value = "SELECT r FROM Recharge r")
    List<Recharge> findAll();
}
