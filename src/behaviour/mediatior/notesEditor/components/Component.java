package behaviour.mediatior.notesEditor.components;

import behaviour.mediatior.notesEditor.mediator.Mediator;

/**
 * Common interface of all components
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
