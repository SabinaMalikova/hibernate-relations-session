package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    @Id
    @GeneratedValue(generator = "task_gen",
                    strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "task_gen",sequenceName = "task_seq",allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    private LocalDate deadline;

    @OneToOne(mappedBy = "task",cascade = {CascadeType.MERGE,
                                           CascadeType.REFRESH,
                                           CascadeType.DETACH})
    private Lesson lesson;
}
