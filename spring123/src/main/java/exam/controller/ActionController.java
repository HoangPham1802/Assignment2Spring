package exam.controller;

import exam.entity.AttendanceDetailt;
import exam.entity.AttendanceSlots;
import exam.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.List;

@Controller
public class ActionController {
    @Autowired
    private AttendanceDetailtModel attendanceDetailtModel;
    @Autowired
    private AttendanceSlotsModel attendanceSlotsModel;
    @Autowired
    private ClassInfoModel classInfoModel;
    @Autowired
    private StudentClassModel studentClassModel;
    @Autowired
    private StudentModel studentModel;
    @Autowired
    private TimeslotsModel timeslotsModel;

    @RequestMapping(path = "/times", method = RequestMethod.GET)
    public String times(Model model) {
        List<AttendanceSlots> attendanceSlotsList = attendanceSlotsModel.
                findByNgayDiemDanhBetween(
                        1527683830069l,1527683830569l
                );
        model.addAttribute("attendanceSlotsList", attendanceSlotsList);
        return "times";
    }

    @RequestMapping(path = "/attend/{id}", method = RequestMethod.GET)
    public String attend(@PathVariable int id, Model model) {
        List<AttendanceDetailt> attendanceDetailList = attendanceDetailtModel.findByAttendanceSlots_Id(id);
        model.addAttribute("id", id);
        model.addAttribute("attendanceDetailList", attendanceDetailList);
        return "attend";
    }
}
