package ru.rail.ecommerce.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "purchase")
public class Purchases {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "id")
  private User user;
   @ManyToOne
   @JoinColumn(name = "id")
   private Goods goods;
   private int price;

   private boolean isBought;

    public Purchases() {
    }

    public Purchases(Integer id, User user,
                     Goods goods, int price,
                     boolean isBought) {
        this.id = id;
        this.user = user;
        this.goods = goods;
        this.price = price;
        this.isBought = isBought;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchases purchases)) return false;
        return getPrice() == purchases.getPrice() && isBought() == purchases.isBought() && Objects.equals(getId(), purchases.getId()) && Objects.equals(getUser(), purchases.getUser()) && Objects.equals(getGoods(), purchases.getGoods());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUser(), getGoods(), getPrice(), isBought());
    }
}
