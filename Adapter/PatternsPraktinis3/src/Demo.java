
import java.util.List;

public class Demo {

	// pakeiskite EmployeeClient klasę
	// main metodas turi atspausdinti 3 darbuotojus

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();

		List<Employee> employees = client.getEmployeeList();

		System.out.println(employees);

	}
}
