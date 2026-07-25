package junittestexercise;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class InteractionVerificationTest {

    @Test
    public void shouldVerifyThatDataIsRequestedFromTheApi() {
        ExternalApi externalApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(externalApi);

        service.fetchData();

        verify(externalApi).getData();
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
