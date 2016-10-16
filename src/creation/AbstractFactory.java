package creation;

import move.type.Move;
import style.type.Style;

public interface AbstractFactory {
    Move getMove();
    Style getStyle();
}
