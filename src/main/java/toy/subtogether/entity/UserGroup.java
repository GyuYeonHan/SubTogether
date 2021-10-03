package toy.subtogether.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserGroup {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<Group> groups = new ArrayList<>();

    @OneToMany
    private List<User> users = new ArrayList<>();

}
