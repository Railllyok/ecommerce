package ru.rail.ecommerce.models;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "balance")
    private int balance;

    //    @ManyToMany
    //    @JoinTable(
    //            name = "Cart",
    //            joinColumns = @JoinColumn(name = "user_id"),
    //            inverseJoinColumns = @JoinColumn(name = "goods_id"))
    //    private List<Goods> goods;

//    @OneToMany(mappedBy = "user")
//    Set<Purchase> purchases;
    @OneToMany(mappedBy = "user")
    private Set<Purchases> purchases;

    public User() {
    }

    public User(String username, String email, String password,
                int balance, List<Goods> goods, Set<Purchases> purchases) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.balance = balance;
//        this.goods = goods;
        this.purchases = purchases;
    }

    public int getUserId() {
        return id;
    }

    public void setUserId(int userId) {
        this.id = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

//    public List<Goods> getGoods() {
//        return goods;
//    }
//
//    public void setGoods(List<Goods> goods) {
//        this.goods = goods;
//    }

    public Set<Purchases> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchases> purchases) {
        this.purchases = purchases;
    }
}
//- Для того чтобы воспользоваться магазином, пользователь должен быть зарегестрированным и войти в учетную запись;
//        - Пользователь может покупать товары, оставлять о них отзывы и ставить оценки;
//        - Каждая покупка должна сохраняться в истории покупок;
//        - Пользователь может просмотреть свою историю покупок;
//        - Админ может просмотреть историю покупок любого пользователя;
//        - Пользователь может совершить возврат в течении суток с момента покупки;
//        - Пользователь не может оценить или оставить отзыв о товаре, не купив его;
//        - Информация о пользователе состоит из:  // Class User
//        - Юзернейма;
//        - Почты;
//        - Пароля;
//        - Баланса.

/////////////////////////////

//       - Так как заявка на регистрацию организации добавляется авторизованным пользователем,
//        то получателем выручки является данный пользователь;
//
//        - Каждый пользователь может создавать неограниченное количество организаций;
//
//        - Пользователи, зарегестрировавшие свою организацию, могут добавлять заявки
//        на регистрацию товаров, и после модерации будут добавлены в общий список товаров;
//
//        - При добавлении товара пользователем, он обязан указать, от лица какой организации этот товар поставляется;
//
//        - Выручку с покупки товаров, принадлежащих организации, за вычетом комиссии, получает организация.
//        Комиссия произвольная (например, 5%);
//
//        - Админ вправе принимать заявки на регистрацию организации, замораживать и удалять активные организации;
//
//        - Если организация заморожена или удалена, пользователи не должны видеть товары в списке доступных,
//        однако, у купленных товаров должна сохраняться информация об организации.
//        Т.е. даже об удаленных, а точнее забаненных организациях информация должна оставаться.