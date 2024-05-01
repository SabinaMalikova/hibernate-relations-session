package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(generator = "course_gen",
                    strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "course_gen",
                       sequenceName = "course_seq",
                       allocationSize = 1)
    private Long id;
    private String name;
    private double price;
    private LocalDate dateOfBirth;

    @ManyToMany(mappedBy = "courses", cascade = {CascadeType.REFRESH,
                                                 CascadeType.MERGE,
                                                 CascadeType.DETACH})
    private List<Student>students;

    @OneToMany(mappedBy = "course", cascade = {CascadeType.REFRESH,
                                               CascadeType.MERGE,
                                                CascadeType.REMOVE})
    private List<Lesson>lessons;

    @OneToMany (cascade = {CascadeType.MERGE,
                           CascadeType.REFRESH,
                           CascadeType.DETACH})
    private List<Mentor>mentors;

}
