package View;

import java.util.List;

import Controller.Controller;
import Controller.iGetController;
import Controller.iGetView;
import Model.Domen.Student;

public class View implements iGetView {

    private iGetController control;

    public void setController(iGetController control) {
        this.control = control;
    }

    public void callModel()
    {
        control.update();
    }

    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов ----------");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}