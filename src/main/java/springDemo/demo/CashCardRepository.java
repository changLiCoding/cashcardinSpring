package springDemo.demo;
import org.springframework.data.repository.CrudRepository;
public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}