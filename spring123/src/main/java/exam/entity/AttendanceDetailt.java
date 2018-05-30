package exam.entity;

import javax.persistence.*;

@Entity
public class AttendanceDetailt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private AttendanceSlots attendanceSlots;
    @ManyToOne
    private Student student;
    private long thoiGianDiemDanh;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AttendanceSlots getAttendanceSlots() {
        return attendanceSlots;
    }

    public void setAttendanceSlots(AttendanceSlots attendanceSlots) {
        this.attendanceSlots = attendanceSlots;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getThoiGianDiemDanh() {
        return thoiGianDiemDanh;
    }

    public void setThoiGianDiemDanh(long thoiGianDiemDanh) {
        this.thoiGianDiemDanh = thoiGianDiemDanh;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
