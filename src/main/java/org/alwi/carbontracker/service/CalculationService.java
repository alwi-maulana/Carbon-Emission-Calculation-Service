package org.alwi.carbontracker.service;

import org.alwi.carbontracker.dto.request.EventCalculationRequestDTO;
import org.alwi.carbontracker.dto.response.EventCalculationResultDTO;

public interface CalculationService {
    EventCalculationResultDTO receiverSingleCalculation(EventCalculationRequestDTO requestBody);
}
