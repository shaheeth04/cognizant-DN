import EmployeeCard from './EmployeeCard';

function EmployeesList(props) {
  return (
    <div>
      <h1>Employees List</h1>
      {
        props.employees.map(employee =>
          // Theme prop is no longer passed here
          <EmployeeCard employee={employee} key={employee.id} />
        )
      }
    </div>
  );
}

export default EmployeesList;