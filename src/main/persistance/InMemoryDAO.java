package persistance;

import domain.HasID;

import java.util.*;

public class InMemoryDAO<ID, T extends HasID<ID>> implements DAO<ID, T> {

    Map<ID, T> entities = new HashMap<ID, T>();

    @Override
    public Optional<T> get(ID id) {
        return Optional.ofNullable(entities.get(id));
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(entities.values());
    }

    @Override
    public void save(T entity) {
        entities.put(entity.getID(), entity);
    }

    @Override
    public void update(ID id, T newEntity) {
        entities.replace(id, newEntity);
    }

    @Override
    public void delete(ID id) {
        entities.remove(id);
    }
}
