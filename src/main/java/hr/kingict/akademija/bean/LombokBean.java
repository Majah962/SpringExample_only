package hr.kingict.akademija.bean;


import lombok.*;

@Data

public class LombokBean {

    @NonNull
    private int lombokId;
    @NonNull
    private String lombokName;
}
