package exam.model;

import exam.entity.ClassInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassInfoModel extends PagingAndSortingRepository<ClassInfo, Integer> {
}
