package no.hvl.dat108;


import javax.persistence.*;

@Entity
@Table(schema = "f17", name = "student")
public class Student {

    @Id
    private String id;
    private String navn;

    @ManyToOne
    @JoinColumn(name="klasse_kode", referencedColumnName = "kode")
    private Klasse klasse;

    @Override
    public String toString() {
        return "Student [id=" + id + ", navn=" + navn + "]";
    }
}
