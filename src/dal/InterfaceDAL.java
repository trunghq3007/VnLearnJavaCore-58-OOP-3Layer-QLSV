package dal;

import java.util.List;

import entity.KhoaHoc;

public interface InterfaceDAL<T> {
        public List<T> getList(String sql);
        void show(List<T> objects);
        boolean insert(T object);
        int delete(T object);
        int update(T object);
        
        
}
