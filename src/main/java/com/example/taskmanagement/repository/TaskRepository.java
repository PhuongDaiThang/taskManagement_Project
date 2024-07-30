package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
    // Bạn có thể định nghĩa các phương thức tìm kiếm tùy chỉnh tại đây nếu cần
}
