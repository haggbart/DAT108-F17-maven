package no.hvl.dat108;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(schema = "f17", name = "klasse")
public class Klasse {

    @Id
    private String kode;
    private String program;

    @OneToMany(mappedBy = "klasse") //, fetch = FetchType.EAGER)
    private List<Student> studenter;

    public String getKode() {
        return kode;
    }

    public String getProgram() {
        return program;
    }

    public List<Student> getStudenter() {
        return studenter;
    }
}
