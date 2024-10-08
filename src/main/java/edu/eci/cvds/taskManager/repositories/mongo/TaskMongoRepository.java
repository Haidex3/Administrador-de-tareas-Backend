package edu.eci.cvds.taskManager.repositories.mongo;

import edu.eci.cvds.taskManager.model.TaskMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The TaskMongoRepository interface provides the data access layer for Task entities.
 * It extends the MongoRepository interface, which provides basic CRUD operations.
 */
@Repository
public interface TaskMongoRepository extends MongoRepository<TaskMongo, String> {
    // No additional methods are defined; the default CRUD operations are inherited from MongoRepository.
}
