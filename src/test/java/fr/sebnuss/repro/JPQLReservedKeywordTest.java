package fr.sebnuss.repro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author snussbaumer
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { ReproApplication.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class JPQLReservedKeywordTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testSort_noSort() {
        ResponseEntity<String> response = testRestTemplate.exchange("/persons", HttpMethod.GET, null, String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void testSort_sortByUpdate() {
        ResponseEntity<String> response = testRestTemplate.exchange("/persons/?sort=update,desc&size=10&page=0",
                HttpMethod.GET, null, String.class);
        // The assertion below fails, we get an HttpStatus.INTERNAL_SERVER_ERROR
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}
