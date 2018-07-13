import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	
	private int id;
	
	@NotNull(message = "Name should not be empty")
	@Size(min=3,max=15,message="size should be between 3 to 15")
	private String name;
	
	@Min(value=100,message="minimum value should be 100")
	private long salary;
	
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
		
	
}
