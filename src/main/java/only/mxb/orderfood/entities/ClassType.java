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
 * @Create 2020-05-17 17:42:29
 */
@Component
@Entity
@Table(name = "class_type", schema = "")
public class ClassType implements Serializable {

    private static final long serialVersionUID = 7927358077595273394L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public ClassType() {
    }

    @Override
    public String toString() {
        return "TpApiConfig{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
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

}
