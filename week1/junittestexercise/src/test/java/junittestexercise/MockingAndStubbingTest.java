package junittestexercise;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MockingAndStubbingTest {

    @Test
    public void shouldUseStubbedDataFromExternalApi() {
        ExternalApi externalApi = Mockito.mock(ExternalApi.class);
        when(externalApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(externalApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    public interface ExternalApi {
        String getData();
    }

    public static class MyService {
        private final ExternalApi externalApi;

        public MyService(ExternalApi externalApi) {
            this.externalApi = externalApi;
        }

        public String fetchData() {
            return externalApi.getData();
        }
    }
}
