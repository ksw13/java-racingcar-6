package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.MessageConst;

public class InputView {
    public String inputCarNames() {
        System.out.println(MessageConst.INPUT_NAME_MSG);
        return Console.readLine();
    }
}
