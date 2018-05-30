package exam.model;

import exam.entity.AttendanceDetailt;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AttendanceDetailtModel extends PagingAndSortingRepository<AttendanceDetailt, Integer> {
    List<AttendanceDetailt> findByAttendanceSlots_Id(int id);
}
