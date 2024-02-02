package com.example.backendgelsa.usecase.recharges;

import com.example.backendgelsa.adapter.repository.RechargeRepository;
import com.example.backendgelsa.domain.dto.RechargeDto;
import com.example.backendgelsa.domain.entities.Operators;
import com.example.backendgelsa.domain.entities.Recharge;
import com.example.backendgelsa.domain.exception.ClassException;
import com.example.backendgelsa.domain.mapper.RechargeMapper;
import com.example.backendgelsa.usecase.validator.RechargesValidator;

import java.util.Date;

public class CreateRechargeUseCase {
    private RechargeRepository rechargeRepository;
    public CreateRechargeUseCase ( RechargeRepository rechargeRepository) {
        this.rechargeRepository = rechargeRepository;

    }
    public void execute(RechargeDto dto) throws ClassException{
        // Validar el operador antes de intentar deserializar la solicitud JSON


        // Si el operador es válido, continuamos con la ejecución
        // Convertir dto a entidad
        RechargesValidator.validateInputDto(dto);
        Recharge recharge = RechargeMapper.INSTANCE.toEntity(dto);
        recharge.setTransactionDate(new Date());
        recharge.setEstatus ("realizada");
        // Guardar recarga
        this.rechargeRepository.save(recharge);
    }

}
