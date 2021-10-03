package toy.subtogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.subtogether.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
