package exam.model;

import exam.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentModel extends PagingAndSortingRepository<Student, Integer> {
}
