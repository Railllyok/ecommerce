package ru.rail.ecommerce.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "balance")
    private int balance;

    @ManyToMany
    @JoinTable(
            name = "Cart",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "goods_name"))
    private List<Goods> goods;

    public User() {
    }

    public User(int userId, String username, String email, String password, List<Goods> goods) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.goods = goods;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
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