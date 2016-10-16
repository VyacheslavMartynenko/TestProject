package creation;

import move.MoveType;
import move.type.Move;
import style.StyleType;
import style.type.Style;

public interface AbstractFactory {
    Move getMove();
    Style getStyle();
}
