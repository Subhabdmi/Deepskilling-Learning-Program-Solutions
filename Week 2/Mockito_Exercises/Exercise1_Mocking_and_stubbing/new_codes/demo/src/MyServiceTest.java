package demo.src;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create mock
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);

        // 2. Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        MyService service = new MyService(mockApi);

        // 4. Call method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
