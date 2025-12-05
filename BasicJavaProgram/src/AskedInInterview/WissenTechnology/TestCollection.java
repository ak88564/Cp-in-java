package AskedInInterview.WissenTechnology;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Student {
    private Integer id;

    private String name;

    public Student(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestCollection {
    public static void main(String args[]) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Krisha"));
        studentList.add(new Student(2, "Aarya"));
        studentList.add(new Student(3, "Tisha"));
        studentList.add(new Student(3, "Ishana"));

        Map<Integer, String> studentMap = new LinkedHashMap<>();
        // Add the Code Changes After This
        for(int i = 0;i<studentList.size();i++){
            studentMap.put(studentList.get(i).getId(), studentList.get(i).getName());
        }

        studentMap.forEach(
                (x, y) -> System.out.println("Student ID : " + x + ", Student Name : " + y));
    }
}
