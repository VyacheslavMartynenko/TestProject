package creation;

import move.MoveFactory;
import move.MoveType;
import move.type.Move;
import style.StyleFactory;
import style.StyleType;
import style.type.Style;

class AggressiveTypeFactory implements AbstractFactory {
    @Override
    public Move getMove() {
        return new MoveFactory().getMove(MoveType.SHOOT);
    }

    @Override
    public Style getStyle() {
        return new StyleFactory().getStyle(StyleType.TECHNICAL);
    }
}
