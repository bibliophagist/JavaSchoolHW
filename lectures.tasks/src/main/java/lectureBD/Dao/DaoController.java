package lectureBD.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoController {

    private Connection connection;

    public void addStudentVisit(int student_id, int lesson_id) {
        try {
            Statement statement = this.connection.createStatement();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("insert into students_visits (student_id, lesson_id) values (")
                    .append(student_id).append(",").append(lesson_id).append(")");
            statement.execute(stringBuilder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checkLectureVisits(int student_id) {
        try {
            Statement statement = this.connection.createStatement();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select X.Lecture_Name, X.Date from lessons X, students_visits Y where Y.student_id=")
                    .append(student_id).append(" and ").append("Y.lesson_id=X.lesson_id");
            statement.execute(stringBuilder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void connectionToDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sberdata", "root", "mysql");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
