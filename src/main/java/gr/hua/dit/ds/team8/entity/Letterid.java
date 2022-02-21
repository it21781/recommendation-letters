package gr.hua.dit.ds.team8.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Letterid {

    @Id
    private String letterid;

    public Letterid() {
    }

    public Letterid(String letterid) {
        super();
        this.letterid = letterid;
    }

    public String getLetterid() {
        return letterid;
    }

    public void setLetterid(String letterid) {
        this.letterid = letterid;
    }

    @Override
    public String toString() {
        return "Letterid [id=" + letterid+"]";
    }
}
