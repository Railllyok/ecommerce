package ru.rail.ecommerce.models;

import javax.persistence.*;

//@Entity
public class Purchase {

//  @Embeddable
  private Purchase id;
  @ManyToOne
  @MapsId("userId")
  @JoinColumn(name = "user_id")
  private User user;
   @ManyToOne
   @MapsId("goodsId")
   @JoinColumn(name = "goods_id")
   private Goods goods;
   private int price;


   private boolean isBought;

}
