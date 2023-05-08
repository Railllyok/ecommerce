package ru.rail.ecommerce.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Goods")
public class Goods  {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "goods_description")
    private String goodsDescription;
//    @Column(name = "company")
//    @ManyToOne
//    @JoinColumn()
//    private Company company;
    @Column(name = "goods_price")
    private int goodsPrice;
    @Column(name = "goods_quantities_in_stock")
    private int goodsQuantitiesInStock;
//    @Column(name = "discount")
//    private Discount discount;
//    @Column(name = "goods_feedBack")
//    private String goodsFeedBack;
//    @Column(name = "goods_keyWord")
//    private String goodsKeyWord;
//    @Column(name = "goods_characteristic")
//    private GoodsCharacteristic goodsCharacteristic;
//    @Column(name = "goods_rate")
//    private int goodsRate;
//    @ManyToMany(mappedBy = "goods")
//    private List<User> user;

//    @OneToMany(mappedBy = "goods")
//    Set<Purchase> purchases;

    @OneToMany(mappedBy = "goods")
    private Set<Purchases> purchases;

    public Goods() {
    }

    public Goods(String goodsName, String goodsDescription, int goodsPrice,
                 int goodsQuantitiesInStock, Discount discount, Set<Purchases> purchases) {
        this.goodsName = goodsName;
        this.goodsDescription = goodsDescription;
        this.goodsPrice = goodsPrice;
        this.goodsQuantitiesInStock = goodsQuantitiesInStock;
//        this.discount = discount;
        this.purchases = purchases;
    }

    public int getGoodsId() {
        return id;
    }

    public void setGoodsId(int goodsId) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsQuantitiesInStock() {
        return goodsQuantitiesInStock;
    }

    public void setGoodsQuantitiesInStock(int goodsQuantitiesInStock) {
        this.goodsQuantitiesInStock = goodsQuantitiesInStock;
    }

//    public Discount getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(Discount discount) {
//        this.discount = discount;
//    }

    public Set<Purchases> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchases> purchases) {
        this.purchases = purchases;
    }
}


//- Функционал админа расширяет весь упомянутый функционал пользователя;
//        - Админ может добавлять и изменять любую информацию о товарах в магазине;
//        - Информация о товаре состоит из:

//        - Названия;
//        - Описания;
//        - Организации;
//        - Цены;
//        - Количества на складе;
//        - Информации о скидах;
//        - Отзывов;
//        - Ключевых слов;
//        - Таблицы характеристик;
//        - Оценок.