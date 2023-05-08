package ru.rail.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PurchaseKey implements Serializable {

    @Column(name = "user_id")
    private int userId;
    @Column(name = "goods_id")
    private int goodsId;

    public PurchaseKey(){
    }

    public PurchaseKey(int userId, int goodsId) {
        this.userId = userId;
        this.goodsId = goodsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseKey that)) return false;
        return getUserId() == that.getUserId() && getGoodsId() == that.getGoodsId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getGoodsId());
    }
}
