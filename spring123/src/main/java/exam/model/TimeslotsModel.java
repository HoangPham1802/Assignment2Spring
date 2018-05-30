package exam.model;

import exam.entity.Timeslots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeslotsModel extends PagingAndSortingRepository<Timeslots, Integer> {
}
