package no.hvl.dat108;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class StudentDAO {

    @PersistenceContext(name = "studentPU")
    private EntityManager em;

    public List<Student> hentAlleStudenter() {
        return em.createQuery("select s from Student s", Student.class).getResultList();
    }
}
