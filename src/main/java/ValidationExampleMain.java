import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

public class ValidationExampleMain {

	public static void main(String[] args) {
		Employee employee = new Employee(10, null, 99);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Employee>> set = factory.getValidator().validate(employee);
		set.forEach((t) -> {
			System.out.println(t.getMessage());
		});
	}

}
