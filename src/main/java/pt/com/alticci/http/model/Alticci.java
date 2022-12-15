package pt.com.alticci.http.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Alticci {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer number;
    
    private Long val;

    public Long getId() {
        return this.id;
    }

    public Long setId() {
        return this.id;
    }

    public Integer getNumber() {
        return this.number;
    }

    public Long getVal() {
        return this.val;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setVal(Long val) {
        this.val = val;
    }
    
}
