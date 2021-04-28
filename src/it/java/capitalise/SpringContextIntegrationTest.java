package capitalise;

import com.fyfe.aws.awscicdsample.AwsCicdSampleApplication;
import com.fyfe.aws.awscicdsample.controller.CapsController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = AwsCicdSampleApplication.class)
public class SpringContextIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void capitalise() throws Exception {
        mockMvc.perform(get("/caps/word"))
                .andExpect(content().string("WORD"));
    }
}
