package testevaga.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testevaga.model.RedeMT;

@Repository
@Qualifier("h2DataSource")
public interface H2RedeRepository extends JpaRepository<RedeMT, Integer> {
}
