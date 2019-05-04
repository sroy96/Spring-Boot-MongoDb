package school.com.school.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import school.com.school.DAO.SchoolDAO;

import java.util.List;

public interface SchoolRepository extends MongoRepository<SchoolDAO,String> {
    @Override
    <S extends SchoolDAO> List<S> findAll(Example<S> example);
    SchoolDAO findByName(String name);
    SchoolDAO findByRoll(String roll);
    SchoolDAO deleteByRoll(String roll);

}
