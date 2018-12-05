package bll;

import java.util.List;

public interface InterfaceBLL<T> {
         List<T> getList(String sql);
         void insert(T object);
         void delete(T object);
         void update(T object);
         void show(List<T> object);
}
