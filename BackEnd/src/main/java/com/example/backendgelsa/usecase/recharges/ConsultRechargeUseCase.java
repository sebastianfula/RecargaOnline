package com.example.backendgelsa.usecase.recharges;

import com.example.backendgelsa.adapter.repository.RechargeRepository;
import com.example.backendgelsa.domain.dto.RechargeDto;
import com.example.backendgelsa.domain.entities.Recharge;
import com.example.backendgelsa.domain.mapper.RechargeMapper;

import java.util.List;

public class ConsultRechargeUseCase {
    private RechargeRepository rechargeRepository;
    public ConsultRechargeUseCase ( RechargeRepository rechargeRepository) {
        this.rechargeRepository = rechargeRepository;
    }

    public List<RechargeDto> execute() {
        List<Recharge> course = rechargeRepository.findAll();
        List<RechargeDto> listUsers = RechargeMapper.INSTANCE.toDto(course);

        return listUsers;
    }
}
