# Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- **JSR 338 Specification** for persisting, reading and managing data from Java objects
- Does not contain concrete implementation of the specification
- Hibernate is one of the implementations of JPA
- Provides a standard interface for Object-Relational Mapping (ORM)

## Hibernate

- **ORM Tool** that implements JPA
- Provides concrete implementation of JPA specification
- Manages the mapping between Java objects and database tables
- Handles database operations with SQL generation
- Requires manual transaction management and session handling

## Spring Data JPA

- Does not have JPA implementation, but reduces boiler plate code
- Another level of abstraction over JPA implementation provider like Hibernate
- Manages transactions automatically
- Simplifies repository pattern implementation
- Provides built-in CRUD operations without writing boilerplate code

---

## Code Comparison: Hibernate vs Spring Data JPA

### Using Hibernate

```java
/* Method to CREATE an employee in the database */

public Integer addEmployee(Employee employee){
   Session session = factory.openSession();
   Transaction tx = null;
   Integer employeeID = null;

   try {
      tx = session.beginTransaction();
      employeeID = (Integer) session.save(employee);
      tx.commit();
   } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
   } finally {
      session.close();
   }

   return employeeID;
}
```

**Key Points:**

- Manual session management required
- Explicit transaction handling needed
- Manual exception handling and rollback logic
- More boilerplate code
- Developer responsible for resource cleanup

### Using Spring Data JPA

**EmployeeRepository.java**

```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

**EmployeeService.java**

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
```

**Key Points:**

- No manual session management required
- Transaction handling done automatically via @Transactional
- Clean and simple repository interface
- Minimal boilerplate code
- Spring framework handles resource management

---

## Advantages of Spring Data JPA over Hibernate

1. **Reduced Boilerplate Code** - No need for manual session and transaction management
2. **Automatic Transaction Management** - @Transactional annotation handles transactions
3. **Repository Pattern** - Pre-built CRUD operations through JpaRepository
4. **Consistency** - Follows Spring Framework patterns and conventions
5. **Ease of Testing** - Repositories can be easily mocked
6. **Performance** - Lazy loading and caching handled automatically

---

## Architecture Layer Diagram

```
Application Layer (Spring Boot Application)
              ↓
Spring Data JPA Layer (Repository abstraction)
              ↓
Hibernate Layer (JPA Implementation)
              ↓
JPA API Layer (Specification)
              ↓
Database Layer (MySQL, Oracle, etc.)
```

---

## Reference Links

- [DZone: What is the Difference Between Hibernate and Spring Data JPA](https://dzone.com/articles/what-is-the-difference-between-hibernate-and-sprin-1)
- [JavaWorld: What is JPA - Introduction to the Java Persistence API](https://www.javaworld.com/article/3379043/what-is-jpa-introduction-to-the-java-persistence-api.html)
