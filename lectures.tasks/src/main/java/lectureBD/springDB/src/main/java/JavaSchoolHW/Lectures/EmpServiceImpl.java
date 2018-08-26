package JavaSchoolHW.Lectures;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Employee> loadAll(){
        return entityManager.createQuery("select e from Employee e").getResultList();
    }
}
