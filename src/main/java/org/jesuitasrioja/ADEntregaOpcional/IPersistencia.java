package org.jesuitasrioja.ADEntregaOpcional;

import java.util.Date;
import java.util.Set;

public interface IPersistencia {
	public Department getDepartment(String codigoDepartamento);

	public Employee getEmployee(String codigoEmpleado);

	public Set<Employee> listaEmpleados();

	public Set<Department> listaDepartamentos();

	public Set<Employee> listaEmpleadosDepartamento(String codigoDepartamento);

	public Employee managerDepartamento(String codigoDepartamento);

	public Boolean isManager(String codigoDepartamento, String codigoempleado);
	
	public Boolean getSalario(String codigoEmpleado, Date fecha);
	
	public Set<Employee> getEmployeesByTitle(String title);
	
	public Boolean nuevoEmpleado(Employee newEmployee, String noDept, Date inicio, Integer salario);
	
	public Boolean eliminarEmpleado(Employee newEmployee);
	
	public Boolean nuevoSalario(Employee newEmployee, Integer salario);

}
