package ru.rail.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rail.ecommerce.models.Purchases;

@Repository
public interface PurchasesRepository extends JpaRepository<Purchases, Long> {

}
