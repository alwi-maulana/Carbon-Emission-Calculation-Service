package org.alwi.carbontracker.controller;

import org.alwi.carbontracker.dto.request.EventCalculationRequestDTO;
import org.alwi.carbontracker.dto.response.EventCalculationResultDTO;
import org.alwi.carbontracker.service.CalculationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carbon/calculation")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping("/event")
    public ResponseEntity<Object> eventCalculation(@RequestBody EventCalculationRequestDTO requestBody) {
        EventCalculationResultDTO response = calculationService.recieverSingleCalculation(requestBody);
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }



}
