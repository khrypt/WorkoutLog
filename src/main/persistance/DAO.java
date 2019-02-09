package persistance;

import java.util.List;
import java.util.Optional;

public interface DAO<ID, T> {

    Optional<T> get(ID id);

    List<T> getAll();

    void add(T entity);

    void update(ID id, T newEntity);

    void remove(ID id);
}
