package toy.subtogether.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Subscription {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int totalPrice;
    private int maxCount;
}
