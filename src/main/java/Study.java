import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Study {
    private String name;
    private int age;
    private int studId;

    public Study(String name, int studId) {
        this.name = name;
        this.studId = studId;
    }
}
