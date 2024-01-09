package ie.atu.studentreg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "confirmation-service", url = "${feign.url}")
public interface RegConfirmationClient {
    @PostMapping("/confirmReg")
    Map<String, String> confirmRegistration(@RequestBody StudentDetails studentDetails);
}
