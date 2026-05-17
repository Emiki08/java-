package raisetech.StudentManagement;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	private Map<String, String> student = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


	// 全学生表示
	@GetMapping("/studentInfo")
	public Map<String, String> getStudentInfo() {

		return student;
	}

	// 学生追加
	@PostMapping("/studentInfo")
	public String setStudentInfo(String name, String age) {

		student.put(name, age);

		return name + "を追加しました";
	}
}
	

