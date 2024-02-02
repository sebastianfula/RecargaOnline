package com.example.backendgelsa.domain.mapper;

import com.example.backendgelsa.domain.dto.RechargeDto;
import com.example.backendgelsa.domain.entities.Recharge;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RechargeMapper {

    RechargeMapper INSTANCE = Mappers.getMapper (RechargeMapper.class);
    RechargeDto toDto(Recharge course);

    Recharge toEntity(RechargeDto course);

    List<RechargeDto> toDto(List<Recharge> course);

    List<Recharge> toEntity(List<RechargeDto> course);
}
