package ru.rail.ecommerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rail.ecommerce.models.Goods;
import ru.rail.ecommerce.models.User;
import ru.rail.ecommerce.services.PurchasesService;

@RestController
@RequestMapping("/api/v1/purchases")
public class PurchasesController {
    private final PurchasesService purchasesService;

    public PurchasesController(PurchasesService purchasesService) {
        this.purchasesService = purchasesService;
    }

    @PostMapping("/add/{user_id}/{goods_id}")
    public ResponseEntity<Integer> addToCart(@PathVariable("user_id") int userId,@PathVariable("goods_id") int goodsId) {
       return ResponseEntity.ok(purchasesService.addToCart(userId, goodsId));
    }

}
