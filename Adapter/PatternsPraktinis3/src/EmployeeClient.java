
import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {

		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDB = new EmployeeDB("1234", "John", "Smith", "john@aaa.com");

		employees.add(employeeFromDB); // prideda be problemų

		EmployeeLdap employeeFromLdap =new EmployeeLdap("aaa", "Jones", "Mark", "mark@bbb.com");

		EmployeeCSV employeeFromCSV = new EmployeeCSV("123,Harry,Brown,harry@ccc.com");

		// pridėkite employeeFromLdap ir employeeFromCSV į kolekciją "employees"

		Employee empcsv = new AdapterCSV(employeeFromCSV);
		employees.add(empcsv);
		Employee empLdap = new AdapterLdap(employeeFromLdap);
		employees.add(empLdap);

		return employees;

	}

}
