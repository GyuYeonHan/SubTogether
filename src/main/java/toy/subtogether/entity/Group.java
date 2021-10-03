package toy.subtogether.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Group {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_id")
    private Subscription subscription;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserGroup userGroup;
}
