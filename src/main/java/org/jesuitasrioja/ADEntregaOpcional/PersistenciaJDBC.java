package org.jesuitasrioja.ADEntregaOpcional;

import java.util.Date;
import java.util.Set;

public class PersistenciaJDBC implements IPersistencia {

	@Override
	public Department getDepartment(String codigoDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(String codigoEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> listaEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Department> listaDepartamentos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> listaEmpleadosDepartamento(String codigoDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee managerDepartamento(String codigoDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isManager(String codigoDepartamento, String codigoempleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getSalario(String codigoEmpleado, Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> getEmployeesByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean nuevoEmpleado(Employee newEmployee, String noDept, Date inicio, Integer salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarEmpleado(Employee newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean nuevoSalario(Employee newEmployee, Integer salario) {
		// TODO Auto-generated method stub
		return null;
	}

}
