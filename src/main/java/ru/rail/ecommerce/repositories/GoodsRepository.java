package ru.rail.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rail.ecommerce.models.Goods;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
}
