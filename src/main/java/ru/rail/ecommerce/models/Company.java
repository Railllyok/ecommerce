package ru.rail.ecommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @Column(name = "company_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int companyId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "logo")
    private String logo;
    @Column(name = "goods")
    @OneToMany(mappedBy = "company")
    private List<Goods> goods;

    public Company() {
    }
    public Company(String name, String description, String logo, List<Goods> goods) {
        this.name = name;
        this.description = description;
        this.logo = logo;
        this.goods = goods;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
//- Пользователь может просмотреть свои уведомления
//        - Пользователь может подать заявку на регистрацию организации;
//        - Организация дает возможность ее создателю добавлять товары и продавать их в данном магазине;
//        - Организация состоит из:                                // Class Company
//        - Имени;
//        - Описания
//        - Логотипа;
//        - Товаров.
