package ie.atu.springbootvalidation;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }
    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId)
    {
        if(employeeId.length() > 5 || employeeId.isBlank())
        {
            return ResponseEntity.badRequest().body("EmployeeId is invalid");

        }
        Person person = personService.getPersonByEmployeeId(employeeId);

        if (person == null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(person);
    }
    @PostMapping("/save-person")
    public String savePerson()
    {

    }


}
