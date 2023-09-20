package net.javaguides.studentapp.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;
}
