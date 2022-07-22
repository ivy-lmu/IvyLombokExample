package ivy.lombok.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.environment.IvyTest;
import ivy.lombok.example.User;

@IvyTest
public class UserTest{

  @Test
  public void user(){
    var user = User.builder()
            .name("Trudy")
            .email("trudy@axonivy.com")
            .build();
    assertThat(user.getName()).isEqualTo("Trudy");
    assertThat(user.getEmail()).isEqualTo("trudy@axonivy.com");
  }

}
