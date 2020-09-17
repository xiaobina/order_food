package only.mxb.orderfood.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description
 * @Author isalo
 * @Create 2020-05-17 17:41:25
 */
@Component
@Entity
@Table(name = "product", schema = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 7050677243757691996L;

    /**
     * 食物ID
     */
    @Id
    @Column(name = "id")

    private Long id;

    /**
     * 食物名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 食物价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 食物类型
     */
    @Column(name = "classid")
    private String classid;

    @Column(name = "src")
    private String src;

    public Product() {
    }

    @Override
    public String toString() {
        return "TpApiConfig{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                "classid='" + classid + '\'' +
                "src='" + src + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getClassid() {
        return this.classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}
