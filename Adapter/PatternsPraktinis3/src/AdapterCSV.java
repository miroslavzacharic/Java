
class AdapterCSV implements Employee {
    private EmployeeCSV employeeCSV;

    public AdapterCSV(EmployeeCSV employeeCSV) {
        super();
        this.employeeCSV = employeeCSV;
    }


    @Override
    public String getId() {
        return "" + employeeCSV.getId();
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", First name: " + getFirstName() + ", Last name: " + getLastName() + ", Email: " + getEmail();
    }
}