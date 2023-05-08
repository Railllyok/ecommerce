package ru.rail.ecommerce.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ru.rail.ecommerce.models.Goods;
import ru.rail.ecommerce.models.Purchases;
import ru.rail.ecommerce.models.User;
import ru.rail.ecommerce.repositories.GoodsRepository;
import ru.rail.ecommerce.repositories.PurchasesRepository;
import ru.rail.ecommerce.repositories.UserRepository;

import java.util.Optional;

@Service
public class PurchasesService {
    private final PurchasesRepository purchasesRepository;
    private final UserRepository userRepository;
    private final GoodsRepository goodsRepository;

    public PurchasesService(PurchasesRepository purchasesRepository,
                            UserRepository userRepository,
                            GoodsRepository goodsRepository) {
        this.purchasesRepository = purchasesRepository;
        this.userRepository = userRepository;
        this.goodsRepository = goodsRepository;
    }

    public Integer addToCart(int userId, int goodsId) {
        Optional<User> user = userRepository.findById(userId);

        if(!user.isPresent()){
            throw new RuntimeException("User not found");
        }
        Optional<Goods> goods = goodsRepository.findById(goodsId);
        if (!goods.isPresent()){
            throw new RuntimeException("Goods not found!");
        }
        Purchases purchases = new Purchases();
        purchases.setGoods(goods.get());
        purchases.setUser(user.get());
        purchases.setBought(false);
        purchases.setPrice(goods.get().getGoodsPrice());
        Purchases save = purchasesRepository.save(purchases);

        return save.getId();
    }

}
