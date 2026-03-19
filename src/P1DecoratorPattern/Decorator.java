package P1DecoratorPattern;

import P1DecoratorPattern.Template.Component;

public abstract class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
