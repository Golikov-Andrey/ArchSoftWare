package Controller;

import java.util.List;

import Model.Domen.Student;

public interface iGetView {
     public void printAllStudent(List<Student> students);
     public void setController(iGetController control);
}
