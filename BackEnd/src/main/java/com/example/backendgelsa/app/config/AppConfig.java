package com.example.backendgelsa.app.config;

import com.example.backendgelsa.adapter.repository.RechargeRepository;
import com.example.backendgelsa.usecase.recharges.ConsultRechargeUseCase;
import com.example.backendgelsa.usecase.recharges.CreateRechargeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentSkipListMap;

@Configuration
public class AppConfig {
    @Autowired
    private RechargeRepository rechargeRepository;

    @Bean
    public  CreateRechargeUseCase createRechargeUseCase(){
        return new CreateRechargeUseCase (rechargeRepository);
    }

    @Bean
    public ConsultRechargeUseCase consultRechargeUseCase(){
        return new ConsultRechargeUseCase (rechargeRepository);
    }
}
