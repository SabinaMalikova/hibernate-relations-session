package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lesson {
    @Id
    @GeneratedValue(generator = "lesson_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "lesson_gen",
            sequenceName = "lesson_seq",
            allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    private LocalDate publishedDate;
    private String videoLink;
    private boolean isPresentation;

    @ManyToOne(cascade = {CascadeType.REFRESH,
                          CascadeType.MERGE,
                          CascadeType.DETACH})
    private Course course;

    @OneToOne(cascade = {CascadeType.PERSIST,
                         CascadeType.MERGE,
                         CascadeType.REFRESH,
                         CascadeType.REMOVE})
    private Task task;


}
