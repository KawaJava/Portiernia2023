package io.github.kawajava.portiernia2023.user.rental.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RentalTest {

    private final String ACT = "ACT";

    Rental rental1 = new Rental(1L, LocalDate.of(2023, 4, 24),
            LocalTime.of(15,00,00), null, LocalTime.of(17,00,00),
            0, 1,1);
    Rental rental2 = new Rental(2L, LocalDate.of(2023, 4, 25),
            LocalTime.of(16,00,00), null, LocalTime.of(18,00,00),
            0, 2,1);
    Rental rental3 = new Rental(1L, LocalDate.of(2023, 4, 24),
            LocalTime.of(15,00,00), null, LocalTime.of(17,00,00),
            0, 1,1);

    @Test
    void shouldEqualRentals() {

        assertThat(rental1).isEqualTo(rental3);
        assertThat(rental1).isNotEqualTo(rental2);

    }

    @Test
    void shouldHashRentals() {

        assertThat(rental1.hashCode()).isEqualTo(rental3.hashCode());
        assertThat(rental1.hashCode()).isNotEqualTo(rental2.hashCode());

    }

}