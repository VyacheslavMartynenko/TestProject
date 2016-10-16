package style;

import move.MoveType;
import move.type.Move;
import move.type.PassMove;
import move.type.ShootMove;
import move.type.TackleMove;
import style.type.AccuateStyle;
import style.type.Style;
import style.type.TechnicalStyle;

public class StyleFactory {
    public Style getStyle(StyleType styleType) {
        switch (styleType) {
            case ACCURATE:
                return new AccuateStyle();
            case TECHNICAL:
                return new TechnicalStyle();
            default:
                return null;
        }
    }
}
