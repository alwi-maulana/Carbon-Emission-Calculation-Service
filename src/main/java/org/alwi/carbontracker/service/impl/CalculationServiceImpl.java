package org.alwi.carbontracker.service.impl;

import org.alwi.carbontracker.dto.request.EventCalculationRequestDTO;
import org.alwi.carbontracker.dto.response.EventCalculationResultDTO;
import org.alwi.carbontracker.service.CalculationService;
import org.alwi.carbontracker.tool.StringTool;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.alwi.carbontracker.constant.CommonConstant.CalculationType.EVENT;
import static org.alwi.carbontracker.constant.CommonConstant.Default.FAILED;
import static org.alwi.carbontracker.constant.CommonConstant.Default.SUCCESS;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public EventCalculationResultDTO receiverSingleCalculation(EventCalculationRequestDTO requestBody) {

        BigDecimal emissionKg = calculateEmission(requestBody.getAmount(), requestBody.getFactorKg());
        String status = StringTool.isNullOrZero(emissionKg) ? FAILED : SUCCESS;
        return new EventCalculationResultDTO(requestBody.getCarbonActivityId(), emissionKg, LocalDateTime.now(), status, EVENT) ;
    }

    public BigDecimal calculateEmission(BigDecimal amount, BigDecimal factorKg) {
        if (amount == null || factorKg == null) {
            return BigDecimal.ZERO;
        }
        return amount.multiply(factorKg);
    }
}
