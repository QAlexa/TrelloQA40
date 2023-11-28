package dto;

import com.beust.jcommander.Parameter;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class UserDtoLombok {
    String email;
    String password;


}
