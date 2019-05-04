package school.com.school.DAO;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class SchoolDAO {
    @Id
    private String id;
    private String roll;
    private String name;
    private String standard;
    private  int fees;

    public SchoolDAO() {
    }

    public SchoolDAO(String roll, String name, String standard, int fees) {
        this.roll = roll;
        this.name = name;
        this.standard = standard;
        this.fees = fees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
    @Override
    public String toString() {
        return "school{" +
                "id='" + id + '\'' +
                ", roll='" + roll + '\'' +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", fees=" + fees +
                '}';
    }
}
