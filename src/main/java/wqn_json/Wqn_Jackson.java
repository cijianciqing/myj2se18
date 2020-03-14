package wqn_json;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
public class Wqn_Jackson {
    private String name;
    private Integer age;
    private Date birthday;
    private String email;
}
