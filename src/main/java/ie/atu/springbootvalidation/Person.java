package ie.atu.springbootvalidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message="Name cannot be blank")
    @Size(min =2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message="EmployeeId cannot be blank")
    @Size(min =3, max = 10, message ="EmployeeId must be between 2 and 10 numbers")
    private String employeeId;

    @NotNull(message="Age cannot be null")
    private int age;

    @Email(message = "Invalid email address")
    private String email;


}
