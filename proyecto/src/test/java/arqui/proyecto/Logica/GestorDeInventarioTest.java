package arqui.proyecto.Logica;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "test")
class GestorDeInventarioTest {

    @Test
    void createproducto() {
    }

    @Test
    void getproductoById() {
    }

    @Test
    void getAllproductos() {
    }

    @Test
    void updateProducto() {
    }

    @Test
    void deleteproductos() {
    }
}