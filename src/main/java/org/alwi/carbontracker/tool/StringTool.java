package org.alwi.carbontracker.tool;

import java.math.BigDecimal;

public class StringTool {
    public static boolean isNullOrZero(BigDecimal value) {
        return value == null || value.compareTo(BigDecimal.ZERO) == 0;
    }

}
