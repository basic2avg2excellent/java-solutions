package theory.collections.map;

import java.util.List;

import utility.input.Address;

public final class EmployeeKey {
    private Integer empId;
    private String firstName;
    private String lastName;
    private List<Address> address;
    
    public EmployeeKey(Integer empId, String firstName, String lastName, List<Address> address){
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empId == null) ? 0 : empId.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeKey other = (EmployeeKey) obj;
        if (empId == null) {
            if (other.empId != null)
                return false;
        } else if (!empId.equals(other.empId))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }
    public Integer getEmpId() {
        return empId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public List<Address> getAddress() {
        return address;
    }
}