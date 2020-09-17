package only.mxb.orderfood.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author isalo
 * @Create 2020-05-17 21:07:38
 * @Description
 */
@Component
@Entity
@Table(name = "user", schema = "")
public class User implements Serializable {

    private static final long serialVersionUID = 2642739450661121121L;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "code")
    private String code;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                "phone='" + phone + '\'' +
                "code='" + code + '\'' +
                '}';
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
