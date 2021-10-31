<<<<<<< HEAD
<<<<<<< HEAD
package ecommercePrice.mycontroller;
import ecommercePrice.service.WatchService;
import ecommercePrice.mycontroller.MyController;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {WatchService.class, MyController.class})
@WebMvcTest
public class MyControllerIT {
    @Autowired
    private MockMvc mockMvc;
    private void testExample() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/checkout")
                        .content("[\"001\",\"002\",\"001\",\"004\",\"003\"]")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultJSon = result.getResponse().getContentAsString();
        assertNotNull(resultJSon);
        assertEquals("{\"price\": 360 }", resultJSon);
    }
    private void testExampleDiscount() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/checkout")
                        .content("[\"001\",\"002\",\"001\",\"004\",\"003\",\"002\",\"001\"]")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultJSon = result.getResponse().getContentAsString();
        assertNotNull(resultJSon);
        assertEquals("{\"price\": 400 }", resultJSon);
    }
=======
package ecommercePrice.mycontroller;public class MyControllerIT {
>>>>>>> Merge applications
=======
package ecommercePrice.mycontroller;public class MyControllerIT {
>>>>>>> dfdba07a1e605dafcac7445fa339c8d7b80a35d7
}
