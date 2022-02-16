package gr.hua.dit.ds.team8.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "letters")
public class Letter {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "student_fn")
    private String student_fn;

    @Column(name = "student_ln")
    private String student_ln;

    @Column(name = "teacher_fn")
    private String teacher_fn;

    @Column(name = "teacher_ln")
    private String teacher_ln;

    @Column(name = "email")
    private String email;

    @Column(name = "approved")
    private boolean approved;

    public Letter() {
    }

    public Letter(int id, String student_fn, String student_ln, String teacher_fn, String teacher_ln, String email) {
        super();
        this.id = id;
        this.student_fn = student_fn;
        this.student_ln = student_ln;
        this.teacher_fn = teacher_fn;
        this.teacher_ln = teacher_ln;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_fn() {
        return student_fn;
    }

    public void setStudent_fn(String student_fn) {
        this.student_fn = student_fn;
    }

    public String getStudent_ln() {
        return student_ln;
    }

    public void setStudent_ln(String student_ln) {
        this.student_ln = student_ln;
    }

    public String getTeacher_fn() {
        return teacher_fn;
    }

    public void setTeacher_fn(String teacher_fn) {
        this.teacher_fn = teacher_fn;
    }

    public String getTeacher_ln() {
        return teacher_ln;
    }

    public void setTeacher_ln(String teacher_ln) {
        this.teacher_ln = teacher_ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Letter [id=" + id + ", student_fn=" + student_fn + ", student_ln=" + student_ln + ", teacher_fn=" + teacher_fn + ", teacher_ln=" + teacher_ln + ", email=" + email + "]";
    }
}
