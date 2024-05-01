package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(generator = "student_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_gen",
            sequenceName = "student_seq",
            allocationSize = 1)
    private Long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    @ManyToMany(cascade = {CascadeType.MERGE,
                           CascadeType.REFRESH,
                           CascadeType.DETACH})
    private List<Course> courses;

}
