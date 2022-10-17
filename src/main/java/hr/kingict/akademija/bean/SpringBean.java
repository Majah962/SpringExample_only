package hr.kingict.akademija.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    private int id;
    private String name;

    @Autowired
    private FirstBean firstBean;



    public SpringBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String  test() {
     return    firstBean.getName();
    }
}
