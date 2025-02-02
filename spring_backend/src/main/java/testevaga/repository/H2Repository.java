package testevaga.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testevaga.model.Substacao;

@Repository
@Qualifier("h2Data")
public interface H2Repository extends JpaRepository<Substacao, Integer> {

}
