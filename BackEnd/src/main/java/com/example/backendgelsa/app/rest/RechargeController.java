package com.example.backendgelsa.app.rest;

import com.example.backendgelsa.domain.dto.RechargeDto;
import com.example.backendgelsa.usecase.recharges.ConsultRechargeUseCase;
import com.example.backendgelsa.usecase.recharges.CreateRechargeUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recharges")
@CrossOrigin(origins = "*")
public class RechargeController {

    @Autowired
    private CreateRechargeUseCase createRechargeUseCase;

    @Autowired
    private ConsultRechargeUseCase consultRechargeUseCase;

    @PostMapping(value="/create",produces =  MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  createRecharge(@RequestBody RechargeDto rechargeDto) {
        this.createRechargeUseCase.execute(rechargeDto);

        return ResponseEntity.ok("Recarga realizada con éxito");
    }
    @GetMapping(value="/consult",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RechargeDto> showRecharge() {
        List<RechargeDto> courseList = consultRechargeUseCase.execute();
        return courseList;
    }
}
