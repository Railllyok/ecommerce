package ru.rail.ecommerce.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Goods")
public class Goods implements Serializable {

    @Id
    @Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "goods_description")
    private String goodsDescription;
    @Column(name = "company")
    @ManyToOne
    @JoinColumn()
    private Company company;
    @Column(name = "goods_price")
    private int goodsPrice;
    @Column(name = "goods_quantities_in_stock")
    private int goodsQuantitiesInStock;
    @Column(name = "discount")
    private Discount discount;
    @Column(name = "goods_feedBack")
    private String goodsFeedBack;
    @Column(name = "goods_keyWord")
    private String goodsKeyWord;
    @Column(name = "goods_characteristic")
    private GoodsCharacteristic goodsCharacteristic;
    @Column(name = "goods_rate")
    private int goodsRate;
    @ManyToMany(mappedBy = "goods")
    private List<User> user;


    public Goods() {
    }
    public Goods(String goodsName, String goodsDescription, Company company, int goodsPrice,
                 int goodsQuantitiesInStock, Discount discount, String goodsFeedBack,
                 String goodsKeyWord, GoodsCharacteristic goodsCharacteristic, int goodsRate,List<User> user
                 ) {
        this.goodsName = goodsName;
        this.goodsDescription = goodsDescription;
        this.company = company;
        this.goodsPrice = goodsPrice;
        this.goodsQuantitiesInStock = goodsQuantitiesInStock;
        this.discount = discount;
        this.goodsFeedBack = goodsFeedBack;
        this.goodsKeyWord = goodsKeyWord;
        this.goodsCharacteristic = goodsCharacteristic;
        this.goodsRate = goodsRate;
        this.user = user;

    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getGoodsFeedBack() {
        return goodsFeedBack;
    }

    public void setGoodsFeedBack(String goodsFeedBack) {
        this.goodsFeedBack = goodsFeedBack;
    }

    public String getGoodsKeyWord() {
        return goodsKeyWord;
    }

    public void setGoodsKeyWord(String goodsKeyWord) {
        this.goodsKeyWord = goodsKeyWord;
    }

    public GoodsCharacteristic getGoodsCharacteristic() {
        return goodsCharacteristic;
    }

    public void setGoodsCharacteristic(GoodsCharacteristic goodsCharacteristic) {
        this.goodsCharacteristic = goodsCharacteristic;
    }

    public int getGoodsRate() {
        return goodsRate;
    }

    public void setGoodsRate(int goodsRate) {
        this.goodsRate = goodsRate;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
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