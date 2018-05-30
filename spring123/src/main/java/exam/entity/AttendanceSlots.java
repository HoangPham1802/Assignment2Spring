package exam.entity;

import javax.persistence.*;

@Entity
public class AttendanceSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private ClassInfo classInfo;
    @ManyToOne
    private Timeslots timeslots;
    private String maMonHoc;
    private long ngayDiemDanh;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public Timeslots getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(Timeslots timeslots) {
        this.timeslots = timeslots;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public long getNgayDiemDanh() {
        return ngayDiemDanh;
    }

    public void setNgayDiemDanh(long ngayDiemDanh) {
        this.ngayDiemDanh = ngayDiemDanh;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
