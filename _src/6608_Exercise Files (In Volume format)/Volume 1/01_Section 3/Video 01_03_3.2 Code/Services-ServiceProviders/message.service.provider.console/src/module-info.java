import message.provider.console.MessageServiceImpl;

/**
 * Author: mohamed Taman
 * Packt publishing 2018
 */
module message.service.provider.console {

    requires message.service.api;

    requires java.logging;

    provides message.service.MessageService with MessageServiceImpl;

}