package exam.model;

import exam.entity.StudentClass;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentClassModel extends PagingAndSortingRepository<StudentClass, Integer> {
}
