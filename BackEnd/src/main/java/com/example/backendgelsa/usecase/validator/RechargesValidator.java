package com.example.backendgelsa.usecase.validator;

import com.example.backendgelsa.domain.dto.RechargeDto;
import com.example.backendgelsa.domain.exception.ClassException;

import static java.util.Objects.isNull;

public class RechargesValidator {
    public static void validateInputDto(RechargeDto dto){
        if(isNull( dto ))
            throw new ClassException ("La recarga no puede ser nula");
        if(dto.getValue ()== 0)
            throw new ClassException("El valor de la recarga no puede ser 0");
        if(dto.getNumber () == 0)
            throw new ClassException("La numero de la recarga no puede ser vacio");
        if(dto.getOperator () == null )
            throw new ClassException("El operador no puede ser nulo o vacio");
        if(dto.getTypeRecharge () == null || dto.getTypeRecharge().trim().isEmpty())
            throw new ClassException("El tipo de la recarga no puede ser vacia");
        if(dto.getSeller () == null || dto.getSeller().trim().isEmpty())
            throw new ClassException("El vendedor de la recarga no puede ser nulo");
    }
}
