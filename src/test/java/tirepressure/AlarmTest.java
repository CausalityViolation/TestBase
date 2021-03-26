package tirepressure;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AlarmTest {

    @Test
    void pressureIsGood() {

        Sensor sensorTest = mock(Sensor.class);
        when(sensorTest.popNextPressurePsiValue()).thenReturn(22.0);

        Alarm alarmTest = new Alarm(sensorTest, new Threshold(17, 21));

        alarmTest.check();
        assertThat(alarmTest.alarmOn).isTrue();


    }

}