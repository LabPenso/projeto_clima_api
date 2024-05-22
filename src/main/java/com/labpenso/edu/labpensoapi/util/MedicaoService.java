package com.labpenso.edu.labpensoapi.util;

import java.time.LocalDateTime;

public class MedicaoService {

    public static int calcularNumeroMedicao(LocalDateTime horaInicio, LocalDateTime timestamp) {
        long minutosDesdeInicio = java.time.Duration.between(horaInicio, timestamp).toMinutes();
        return (int) (minutosDesdeInicio / 10) + 1;
    }

}