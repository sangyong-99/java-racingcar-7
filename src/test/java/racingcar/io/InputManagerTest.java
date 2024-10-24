package racingcar.io;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class InputManagerTest {
    private static InputManager inputManager;

    @BeforeAll
    static void setUp() {
        inputManager = InputManager.getInstance();
    }

    @Test
    @DisplayName("경주할 자동차 이름 입력 테스트")
    void 경주할_자동차_이름_입력_테스트() {
        String input = "pobi,woni,jun";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String carName = inputManager.carNameInput();
        assertThat(carName).isEqualTo("pobi,woni,jun");
    }
}