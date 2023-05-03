package org.zerock.w1.todo.dto;

import java.time.LocalDate;

// 1-1.DTO 생성
public class TodoDTO {

    private Long tno;

    private String title;

    private LocalDate deuDate;

    private boolean finished;

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDeuDate() {
        return deuDate;
    }

    public void setDeuDate(LocalDate deuDate) {
        this.deuDate = deuDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", deuDate=" + deuDate +
                ", finished=" + finished +
                '}';
    }
}
