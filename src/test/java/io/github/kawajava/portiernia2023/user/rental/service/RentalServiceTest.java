package io.github.kawajava.portiernia2023.user.rental.service;

import io.github.kawajava.portiernia2023.user.rental.model.Rental;
import io.github.kawajava.portiernia2023.user.rental.repository.RentalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.*;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RentalServiceTest {

    @Mock
    private RentalRepository rentalRepository;

    @InjectMocks
    private RentalService rentalService;

    @BeforeEach
    void setUp() {
        when(rentalRepository.findAll()).thenReturn(Arrays.asList(
                new Rental(1L, LocalDate.of(2023, 4, 25),
                        LocalTime.of(13,40, 27),
                        LocalTime.of(16,02, 38),
                        LocalTime.of(16,10, 00), 0 , 1, 1),
                new Rental(2L, LocalDate.of(2023, 4, 25),
                        LocalTime.of(14,00, 05), null,
                        LocalTime.of(17,10, 00), 0 , 1, 1),
                new Rental(3L, LocalDate.of(2023, 4, 25),
                        LocalTime.of(15,8, 46), null,
                        LocalTime.of(15,50, 00), 0 , 1, 1)
        ));
    }
    @Test
    void shouldGetRentalsWithoutReturns() {
        // when
        List<Rental> rentals = rentalService.getRentalsWithoutReturns();
        // then
        assertThat(rentals).hasSize(2);
    }

//    @Test
//    void shouldGetRentalsAfterDeadline() {
//        LocalTime currentLocalTime = LocalTime.of(16, 00, 00);
//        try (MockedStatic<LocalTime> topTimeUtilMock = Mockito.mockStatic(LocalTime.class)) {
//            topTimeUtilMock.when(() -> LocalTime.now()).thenReturn(currentLocalTime);
//        }
//        // when
//        List<Rental> rentals = rentalService.getRentalsAfterDeadline();
//        // then
//        assertThat(rentals).hasSize(1);
//    }

}