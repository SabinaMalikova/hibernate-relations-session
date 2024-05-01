package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "mentors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mentor {
    @Id
    @GeneratedValue(generator = "mentor_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "mentor_gen",
            sequenceName = "mentor_seq",
            allocationSize = 1)
    private Long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
}
