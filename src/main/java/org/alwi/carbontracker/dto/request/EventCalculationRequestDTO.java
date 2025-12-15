package org.alwi.carbontracker.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventCalculationRequestDTO implements Serializable {
    private String carbonActivityId;
    private String activityType;
    private BigDecimal amount;
    private String unit;
    private String activityTime;
    private String createdBy;
    private BigDecimal factorKg;

    public EventCalculationRequestDTO(String carbonActivityId, String activityType, BigDecimal amount, String unit, String activityTime, String createdBy, BigDecimal factorKg) {
        this.carbonActivityId = carbonActivityId;
        this.activityType = activityType;
        this.amount = amount;
        this.unit = unit;
        this.activityTime = activityTime;
        this.createdBy = createdBy;
        this.factorKg = factorKg;
    }

    public String getCarbonActivityId() {
        return carbonActivityId;
    }

    public void setCarbonActivityId(String carbonActivityId) {
        this.carbonActivityId = carbonActivityId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getFactorKg() {
        return factorKg;
    }

    public void setFactorKg(BigDecimal factorKg) {
        this.factorKg = factorKg;
    }
}
