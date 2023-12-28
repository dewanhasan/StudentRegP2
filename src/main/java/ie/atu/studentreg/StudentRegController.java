package ie.atu.studentreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentRegController {
    private final RegConfirmationClient regConfirmationClient;

    @Autowired
    public StudentRegController(RegConfirmationClient regConfirmationClient){
        this.regConfirmationClient = regConfirmationClient;
    }

    @PostMapping("/approved")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> IncomingRegistrationRequest(@RequestBody StudentDetails studentDetails) {
        System.out.println("Student registered: " + studentDetails);
        return regConfirmationClient.confirmRegistration(studentDetails);
    }
}