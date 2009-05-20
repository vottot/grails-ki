
public class TestSecurityFilters {

  def filters = {

    test1(controller: "(authOnly)") {
      before = {
        accessControl {
          true
        }
      }
    }

    test2(controller: "(hasRole)") {
      before = {
        accessControl {
          role("role0")
        }
      }
    }
  }

}