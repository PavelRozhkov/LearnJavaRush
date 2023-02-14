package guide_rest;
/**
 * Ошибка
 * Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'employeeRepository'
 * defined in guide_rest.EmployeeRepository defined in @EnableJpaRepositories declared on
 * JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Not a managed type: class guide_rest.Employee
 */

import org.springframework.data.jpa.repository.JpaRepository;
interface EmployeeRepository extends JpaRepository<Employee, Long> {
}