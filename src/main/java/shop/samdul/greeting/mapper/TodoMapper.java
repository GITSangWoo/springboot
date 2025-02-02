package shop.samdul.greeting.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();

    TodoEntity findById(Integer id);

    void insertEntity(String subject, String body, Boolean completed);

    void deleteEntity(Integer id);

    void updateEntity(TodoEntity todoEntity);

    // void insertEntity(TodoEntity todoEntity);
}