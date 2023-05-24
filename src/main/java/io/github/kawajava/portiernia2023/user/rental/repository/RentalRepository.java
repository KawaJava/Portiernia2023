package io.github.kawajava.portiernia2023.user.rental.repository;

import io.github.kawajava.portiernia2023.user.rental.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
