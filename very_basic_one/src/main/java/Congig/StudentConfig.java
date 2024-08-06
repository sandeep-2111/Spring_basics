package Congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Model.Student;
@Configuration
public class StudentConfig {
    @Bean
    public Student newStudent(){
        return new Student();
    }
}
